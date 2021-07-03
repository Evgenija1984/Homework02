package keyone.keytwo.homework02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView1;
    private Button buttonC;
    private Button buttonEraseToTheLeft;
    private Button buttonDivision;


    private Buttons buttons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            makeToast("Первый запуск onStart");
        } else {
            makeToast("Повторный запуск onStart");
        }
        buttons = new Buttons();
        initView();
    }

    private void initView() {
        textView1 = findViewById(R.id.textView1);
        buttonC = findViewById(R.id.buttonC);
        buttonEraseToTheLeft = findViewById(R.id.buttonEraseToTheLeft);
        buttonDivision = findViewById(R.id.buttonDivision);
        buttonC.setOnClickListener(this);
        buttonEraseToTheLeft.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonC:
                textView1.setText(String.format(Locale.getDefault(), "%s", buttons.getButtonC()));
                break;
            case R.id.buttonEraseToTheLeft:
                textView1.setText(String.format(Locale.getDefault(), "%s", buttons.getButtonEraseToTheLeft()));
                break;
            case R.id.buttonDivision:
                textView1.setText(String.format(Locale.getDefault(), "%s", buttons.getButtonDivision()));
                break;

        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        makeToast("onStart");

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        makeToast("onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        makeToast("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        makeToast("onPause");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        makeToast("onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        makeToast("onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        makeToast("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        makeToast("onDestroy");
    }

    private void makeToast(String toast) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
        Log.d("mylogs", toast);
    }

}
