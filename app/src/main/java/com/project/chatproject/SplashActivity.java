package com.project.chatproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent Intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(Intent);
                finish();

            }
        }, 2000);    // 2초 후 인텐트 실행
    }

    @Override
    public void onBackPressed() {

        showTerminateDialog(this, true);
        //super.onBackPressed();
    }
}


/**
 *

 1. https://firebase.google.com/docs/auth/android/google-signin?hl=ko
 - firebase 프로젝트 연결
 - sha-1 지문 얻어 firebase에 연결 (.android debug.keystore)
 - 구글 로그인 사용 설정
 - 앱 수준 build.gradle 파일에 Firebase 인증에 대한 종속 항목을 추가

 2. https://developers.google.com/identity/sign-in/android/sign-in
 - 로그인 버튼
 - 로그인 구현
 - 로그아웃 mainactivity에 구현
 - 로그아웃 구현
 - 실행
 - 실패

 3. https://firebase.google.com/docs/android/setup?hl=ko
 - add firebase core gradle
 - sha-1 지문 키를 다른 프로젝트에 입력해서 안됬었음. ( 다시 입력하고 로그인하니 정상 작동 )

 */