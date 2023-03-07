package com.example.custom_keyboard;

import android.inputmethodservice.InputMethodService;
import android.view.View;

public class ShareInputMethodServices extends InputMethodService {


    @Override
    public View onCreateInputView() {
       return getLayoutInflater().inflate(R.layout.keyboard_main, null);
    }
}
