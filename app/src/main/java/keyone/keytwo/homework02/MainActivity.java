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
    private Button button1;
    private Button button2;
    private Button button3;
    private Button buttonMultiply;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button buttonMinus;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonPlus;
    private Button buttonPercent;
    private Button button0;
    private Button buttonComma;
    private Button buttonEqual;

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
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        buttonMinus = findViewById(R.id.buttonMinus);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonPercent = findViewById(R.id.buttonPercent);
        button0 = findViewById(R.id.button0);
        buttonComma = findViewById(R.id.buttonComma);
        buttonEqual = findViewById(R.id.buttonEqual);

        buttonC.setOnClickListener(this);
        buttonEraseToTheLeft.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonPercent.setOnClickListener(this);
        button0.setOnClickListener(this);
        buttonComma.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonC:
                textView1.setText(buttons.getButtonC());
                break;
            case R.id.buttonEraseToTheLeft:
                textView1.setText(buttons.getButtonEraseToTheLeft());
                break;
            case R.id.buttonDivision:
                textView1.setText(buttons.getButtonDivision());
                break;
            case R.id.button1:
                textView1.setText(String.format(Locale.getDefault(), "%d", buttons.getButton1()));
                break;
            case R.id.button2:
                textView1.setText(String.format(Locale.getDefault(), "%d", buttons.getButton2()));
                break;
            case R.id.button3:
                textView1.setText(String.format(Locale.getDefault(), "%d", buttons.getButton3()));
                break;
            case R.id.buttonMultiply:
                textView1.setText(buttons.getButtonMultiply());
                break;
            case R.id.button4:
                textView1.setText(String.format(Locale.getDefault(), "%d", buttons.getButton4()));
                break;
            case R.id.button5:
                textView1.setText(String.format(Locale.getDefault(), "%d", buttons.getButton5()));
                break;
            case R.id.button6:
                textView1.setText(String.format(Locale.getDefault(), "%d", buttons.getButton6()));
                break;
            case R.id.buttonMinus:
                textView1.setText(buttons.getButtonMinus());
                break;
            case R.id.button7:
                textView1.setText(String.format(Locale.getDefault(), "%d", buttons.getButton7()));
                break;
            case R.id.button8:
                textView1.setText(String.format(Locale.getDefault(), "%d", buttons.getButton8()));
                break;
            case R.id.button9:
                textView1.setText(String.format(Locale.getDefault(), "%d", buttons.getButton9()));
                break;
            case R.id.buttonPlus:
                textView1.setText(buttons.getButtonPlus());
                break;
            case R.id.buttonPercent:
                textView1.setText(buttons.getButtonPercent());
                break;
            case R.id.button0:
                textView1.setText(String.format(Locale.getDefault(), "%d", buttons.getButton0()));
                break;
            case R.id.buttonComma:
                textView1.setText(buttons.getButtonComma());
                break;
            case R.id.buttonEqual:
                textView1.setText(buttons.getButtonEqual());
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
