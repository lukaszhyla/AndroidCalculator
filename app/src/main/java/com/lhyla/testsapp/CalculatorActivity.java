package com.lhyla.testsapp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.lhyla.testsapp.calculator.Calculator;

import java.math.BigDecimal;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CalculatorActivity extends AppCompatActivity {

    @BindView(R.id.act_test_first_num_ET)
    protected EditText firstNumET;

    @BindView(R.id.act_test_second_num_ET)
    protected EditText secondNumET;

    @BindView(R.id.act_test_result_TV)
    protected TextView resultTV;

    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
        calculator = new Calculator();
    }

    @OnClick(R.id.act_test_add_BTN)
    protected void addBTNOnClick() {
        try {
            int result = calculator.add(getFirstNumFromET(), getSecondNumFromET());
            setResultTVText(result);
        } catch (NumberFormatException num) {
            num.printStackTrace();
        }
    }

    @OnClick(R.id.act_test_minus_BTN)
    protected void minusBTNOnClick() {
        try {
            int result = calculator.minus(getFirstNumFromET(), getSecondNumFromET());
            setResultTVText(result);
        } catch (NumberFormatException num) {
            num.printStackTrace();
        }

    }

    @OnClick(R.id.act_test_multiplication_BTN)
    protected void multiplicationBTNOnClick() {
        try {
            int result = calculator.multiplication(getFirstNumFromET(), getSecondNumFromET());
            setResultTVText(result);
        } catch (NumberFormatException num) {
            num.printStackTrace();
        }

    }

    @OnClick(R.id.act_test_divide_BTN)
    protected void divideBTNOnClick() {
        try {
            BigDecimal result = calculator.divide(getFirstNumFromET(), getSecondNumFromET());
            setResultTVText(result);
        } catch (NumberFormatException num) {
            num.printStackTrace();

        } catch (ArithmeticException num) {
            num.printStackTrace();
            showShortToast("Cannot be spilt by zero");
        }

    }

    private void setResultTVText(int result) {
        resultTV.setText(String.valueOf(result));
    }

    private void setResultTVText(BigDecimal result) {
        resultTV.setText(String.valueOf(result));
    }

    @NonNull
    private Integer getFirstNumFromET() {
        return Integer.parseInt(firstNumET.getText().toString());
    }

    @NonNull
    private Integer getSecondNumFromET() {
        return Integer.parseInt(secondNumET.getText().toString());
    }

    private void showShortToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
