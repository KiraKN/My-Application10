package com.kirakn.myapplication10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.TextView;

import com.kirakn.myapplication10.entity.Car;
import com.kirakn.myapplication10.entity.Minibus;
import com.kirakn.myapplication10.entity.Truck;
import com.kirakn.myapplication10.entity.Vehicle;

public class MainActivity extends AppCompatActivity {

    // поля
    private Vehicle car, truck, minibus; // автомобили

    // дополнительные поля
    private Button button;
    private TextView infoApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // связь полей представления с разметкой по id
        button = findViewById(R.id.button);
        infoApp = findViewById(R.id.infoApp);

        // обработаем нажатие кнопки
        button.setOnClickListener(listener);
    }

    // создадим слушатель кнопки и с помощью анонимного класса переопределим метод onClick(View view)
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // инициализация объектов автомобилей
            car = new Car();
            truck = new Truck();
            minibus = new Minibus();

            // вывод информации об автомобилях на экран
            infoApp.setText("Легковой автомобиль: вместимость " + car.getCapacity() + ", максимальная скорость " + car.getMaxSpeed() + " км/ч, масса " + car.getWeight() + " тонн\n"
                    + "Грузовой автомобиль: вместимость " + truck.getCapacity() + ", максимальная скорость " + truck.getMaxSpeed() + " км/ч, масса " + truck.getWeight() + " тонн\n"
                    + "Микроавтобус: вместимость " + minibus.getCapacity() + ", максимальная скорость " + minibus.getMaxSpeed() + " км/ч, масса " + minibus.getWeight() + " тонн\n");
        }
    };
}