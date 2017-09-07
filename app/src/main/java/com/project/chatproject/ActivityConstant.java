package com.project.chatproject;

import android.content.Context;
import android.content.Intent;

/**
 * 클래스 명칭 및 간단 설명
 *
 * @author 개발자의 id 또는 이름 기입 요망
 */
public final class ActivityConstant {
	public static final String INTENT_FINISH_APP = "FINISH_APP";

	public static void performFinish(Context context) {

		Intent mIntent = new Intent(context, SplashActivity.class);
		mIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP|Intent.FLAG_ACTIVITY_CLEAR_TOP);
		mIntent.putExtra(ActivityConstant.INTENT_FINISH_APP, true);
		context.startActivity(mIntent);
	}
}
