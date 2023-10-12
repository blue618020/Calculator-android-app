package com.blue.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText editPercent;
    EditText editNumber;
    TextView result;
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPercent = findViewById(R.id.editPercent);
        editNumber = findViewById(R.id.editNumber);
        result = findViewById(R.id.result);
        but = findViewById(R.id.but);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 숫자 입력한거 가져오기 (소수점도 가능해야함)
//내가 짠 코드      Double percent = Double.parseDouble(editPercent.getText().toString().trim());
//                Log.i("CAL MAIN", String.valueOf(percent));
//
//                Double number = Double.parseDouble(editNumber.getText().toString().trim());
//                Log.i("CAL MAIN", String.valueOf(number));

                String percent = editPercent.getText().toString().trim();
                Log.i("CAL MAIN", percent);

                String number = editNumber.getText().toString().trim();
                Log.i("CAL MAIN", number);


                // 값 비어있는지 확인
                if (percent.isEmpty() || number.isEmpty()){
                    Snackbar.make(but, "입력 필수", Snackbar.LENGTH_SHORT).show();
                    return;
                }


                // 퍼센트 계산
//내가 짠 코드      String p = (percent * number) / 100;
//                Log.i("CAL MAIN", String.valueOf(p));
//                result.setText(String.valueOf(p)); // 화면 출력

                // 에디트텍스트에서 유저가 입력한 것은, 무조건 문자열로 처리된다.
                // 따라서 숫자로 변경시켜줘야함!
                 Double per = Double.parseDouble(percent);
                 Double num = Double.parseDouble(number);

                 Double res = (per * num) / 100;

                 result.setText("" + res); // ""+문자열로 다시 변경해서 화면 출력

            }
        });
    }
}