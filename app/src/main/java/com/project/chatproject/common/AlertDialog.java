package com.project.chatproject.common;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.view.View;

public class AlertDialog {

    public static final int NO_ICON = -1;  //No icon
    
    /**
     * 기본 메시지 다이얼로그 
     * (버튼 한개)
     * 
     * @param -The context context.
     * @param -IconId icon, such as: R.drawable.icon or DialogTool.NO_ICON.
     * @param -The title title.
     * @param -Message display content.
     * @param -The btnName button name required
     * @param -The listener listener, should implement the android.content.DialogInterface.OnClickListener interface.
     * @return
     */
    public static Dialog createMessageDialog(Context context, String title, String message,
            String btnName, OnClickListener listener, int iconId)
    {
        Dialog dialog = null;
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        
        if (iconId != NO_ICON)
        {
            //The settings dialog icons
            builder.setIcon(iconId);
        }
        //Set the title of the dialog box
        builder.setTitle(title);
        //The settings dialog messages
        builder.setMessage(message);
        //Set the button
        builder.setPositiveButton(btnName, listener);
        //Create a message dialog box
        dialog = builder.create();
        dialog.setCanceledOnTouchOutside(false);
        
        return dialog;
    }
    
    
    
    /**
     * 아이콘 다이얼로그 (confirmation dialog, cancel)
     * 
     * @param -The context context.
     * @param -IconId icon, such as: R.drawable.icon or DialogTool.NO_ICON.
     * @param -The title title.
     * @param -Message display content.
     * @param -PositiveBtnName OK button name required
     * @param -NegativeBtnName cancel button name required
     * @param -The positiveBtnListener listener, should implement the android.content.DialogInterface.OnClickListener interface.
     * @param -The negativeBtnListener listener, should implement the android.content.DialogInterface.OnClickListener interface.
     * @return
     */
    public static Dialog createConfirmDialog(Context context, String title, String message,
            String positiveBtnName, String negativeBtnName, OnClickListener positiveBtnListener, 
            OnClickListener negativeBtnListener, int iconId)
    {
        Dialog dialog = null;
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        
        if (iconId != NO_ICON)
        {
            //The settings dialog icons
            builder.setIcon(iconId);
        }
        //Set the title of the dialog box
        builder.setTitle(title);
        //The settings dialog messages
        builder.setMessage(message);
        //Set the OK button
        builder.setPositiveButton(positiveBtnName, positiveBtnListener);
        //Set the Cancel button
        builder.setNegativeButton(negativeBtnName, negativeBtnListener);
        //Create a message dialog box
        dialog = builder.create();
        dialog.setCanceledOnTouchOutside(false);
        
        return dialog;
    }
    
    
    
    /**
     * Create a dialog box
     * 
     * @param -The context context.
     * @param -IconId icon, such as: R.drawable.icon or DialogTool.NO_ICON.
     * @param -The title title.
     * @param -The itemsString option.
     * @param -PositiveBtnName OK button name required
     * @param -NegativeBtnName cancel button name required
     * @param -The positiveBtnListener listener, should implement the android.content.DialogInterface.OnClickListener interface.
     * @param -The negativeBtnListener listener, should implement the android.content.DialogInterface.OnClickListener interface.
     * @param -The itemClickListener listener, should implement the android.content.DialogInterface.OnClickListener interface.
     * @return
     */
    public static Dialog createSingleChoiceDialog(Context context, String title, String[] itemsString,
            String positiveBtnName, String negativeBtnName, OnClickListener positiveBtnListener, 
            OnClickListener negativeBtnListener, OnClickListener itemClickListener, int iconId)
    {
        Dialog dialog = null;
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        
        if (iconId != NO_ICON)
        {
            //The settings dialog icons
            builder.setIcon(iconId);
        }
        //Set the title of the dialog box
        builder.setTitle(title);
        //Set the radio option, the default parameter 0: first radio button is selected
        builder.setSingleChoiceItems(itemsString, 0, itemClickListener);
        //Set the OK button
        builder.setPositiveButton(positiveBtnName, positiveBtnListener);
        //Set the OK button
        builder.setNegativeButton(negativeBtnName, negativeBtnListener);
        //Create a message dialog box
        dialog = builder.create();
        
        return dialog;
    }
    
    
    
    /**
     * Creates a check box
     * 
     * @param -The context context.
     * @param -IconId icon, such as: R.drawable.icon or DialogTool.NO_ICON.
     * @param -The title title.
     * @param -The itemsString option.
     * @param -PositiveBtnName OK button name required
     * @param -NegativeBtnName cancel button name required
     * @param -The positiveBtnListener listener, should implement the android.content.DialogInterface.OnClickListener interface.
     * @param -The negativeBtnListener listener, should implement the android.content.DialogInterface.OnClickListener interface.
     * @param -The itemClickListener listener, should implement the android.content.DialogInterface.OnMultiChoiceClickListener interface required;
     * @return
     */
    public static Dialog createMultiChoiceDialog(Context context, String title, String[] itemsString,
            String positiveBtnName, String negativeBtnName, OnClickListener positiveBtnListener, 
            OnClickListener negativeBtnListener, OnMultiChoiceClickListener itemClickListener, int iconId)
    {
        Dialog dialog = null;
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        
        if (iconId != NO_ICON)
        {
            //The settings dialog icons
            builder.setIcon(iconId);
        }
        //Set the title of the dialog box
        builder.setTitle(title);
        //Set options
        builder.setMultiChoiceItems(itemsString, null, itemClickListener);
        //Set the OK button
        builder.setPositiveButton(positiveBtnName, positiveBtnListener);
        //Set the OK button
        builder.setNegativeButton(negativeBtnName, negativeBtnListener);
        //Create a message dialog box
        dialog = builder.create();
        
        return dialog;
    }
    
    
    
    /**
     * Create list dialog box
     * 
     * @param -The context context.
     * @param -IconId icon, such as: R.drawable.icon or DialogTool.NO_ICON.
     * @param -The title title.
     * @param -ItemsString list item.
     * @param -NegativeBtnName cancel button name required
     * @param -The negativeBtnListener listener, should implement the android.content.DialogInterface.OnClickListener interface.
     * @return
     */
    public static Dialog createListDialog(Context context, String title, String[] itemsString, 
            String negativeBtnName, OnClickListener negativeBtnListener,
            OnClickListener itemClickListener, int iconId)
    {
        Dialog dialog = null;
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        
        if (iconId != NO_ICON)
        {
            //The settings dialog icons
            builder.setIcon(iconId);
        }
        //Set the title of the dialog box
        builder.setTitle(title);
        //Set up a list of options
        builder.setItems(itemsString, itemClickListener);
        //Set the OK button
        builder.setNegativeButton(negativeBtnName, negativeBtnListener);
        //Create a message dialog box
        dialog = builder.create();
        
        return dialog;
    }
    
    
    /**
     * Create a custom (with confirmation dialog box, cancel)
     * 
     * @param -The context context.
     * @param -IconId icon, such as: R.drawable.icon or DialogTool.NO_ICON.
     * @param -The title title.
     * @param -PositiveBtnName OK button name required
     * @param -NegativeBtnName cancel button name required
     * @param -The positiveBtnListener listener, should implement the android.content.DialogInterface.OnClickListener interface.
     * @param -The negativeBtnListener listener, should implement the android.content.DialogInterface.OnClickListener interface.
     * @param -In the View dialog box is a custom view.
     * @return
     */
    public static Dialog createRandomDialog(Context context, String title, String positiveBtnName,
            String negativeBtnName, OnClickListener positiveBtnListener, 
            OnClickListener negativeBtnListener,View view, int iconId)
    {
        Dialog dialog = null;
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        
        if (iconId != NO_ICON)
        {
            //The settings dialog icons
            builder.setIcon(iconId);
        }
        //Set the title of the dialog box
        builder.setTitle(title);
        builder.setView(view);
        //Set the OK button
        builder.setPositiveButton(positiveBtnName, positiveBtnListener);
        //Set the OK button
        builder.setNegativeButton(negativeBtnName, negativeBtnListener);
        //Create a message dialog box
        dialog = builder.create();
        
        return dialog;
    }

    public static Dialog createSelectDialog(Context context, String[] itemsString, OnClickListener itemClickListener, int iconId){
        Dialog dialog = null;
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);

        if (iconId != NO_ICON)
        {
            //The settings dialog icons
            builder.setIcon(iconId);
        }
        //Set the title of the dialog box
        //Set up a list of options
        builder.setItems(itemsString, itemClickListener);
        //Create a message dialog box
        dialog = builder.create();

        return dialog;
    }
}
