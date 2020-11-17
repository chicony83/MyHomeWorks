package com.example.myhomeworks

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.TransitionDrawable
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_d_z_sensors.*

class DZSensorsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d_z_sensors)

        val sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        val lightSensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT)

        sensorManager.registerListener(object : SensorEventListener {
            override fun onSensorChanged(event: SensorEvent?) {

                val lightVal = event?.values?.get(0) ?: 0.0f
                light_sensor_value.text = lightVal.toDouble().toString()
                if (lightVal < 50) {

                    val colorDrawable =
                        arrayOf(ColorDrawable(Color.RED), ColorDrawable(Color.YELLOW))
                    smoothColorChange(colorDrawable)

                } else if (lightVal < 300) {

                    val colorDrawable =
                        arrayOf(ColorDrawable(Color.YELLOW), ColorDrawable(Color.GREEN))
                    smoothColorChange(colorDrawable)
                }
            }

            override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

            }
        }, lightSensor, 1)

    }

    private fun smoothColorChange(colorDrawable: Array<ColorDrawable>) {
        val transitionDrawable = TransitionDrawable(colorDrawable)
        dz_sensors_background_color.background = transitionDrawable
        transitionDrawable.
        startTransition(5000)
    }


}