package com.example.myapplication1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AuthorInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);

        TextView authorTextView = findViewById(R.id.author_text_view);
        authorTextView.setText("Выполнил:\n" +
        "Студент 3-го курса\n" +
        "Группы АС-63\n" +
        "Казаренко П. В.\n\n" +
                "Проверил:\n" +
        "Козинский А. А.");

        Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Закрываем текущую активность и возвращаемся на MainActivity
            }
        });
    }
}
