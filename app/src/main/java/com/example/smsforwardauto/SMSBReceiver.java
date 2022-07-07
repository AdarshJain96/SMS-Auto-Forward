package com.example.smsforwardauto;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import 	android.telephony.SmsManager;
import android.util.Log;
import android.widget.Toast;

public class SMSBReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub

        if(intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")){
            Bundle bundle = intent.getExtras();           //---get the SMS message passed in---
            SmsMessage[] msgs = null;
            String msg_from;
            if (bundle != null){
                //---retrieve the SMS message received---
                try{
                    Object[] pdus = (Object[]) bundle.get("pdus");
                    msgs = new SmsMessage[pdus.length];
                    for(int i=0; i<msgs.length; i++){
                        msgs[i] = SmsMessage.createFromPdu((byte[])pdus[i]);
                        msg_from = msgs[i].getOriginatingAddress();
                        String msgBody = msgs[i].getMessageBody().toUpperCase();
                        String ph="9920771544";     //Ellie number
                        //String ph="9820837460";
                        String ph1 = "7138208734";  //Adarsh number

                        if(msgBody.contains("CARD SALE APPROVED INR")){
                            /*Toast.makeText(context, "number is "+msg_fro1m, Toast.LENGTH_SHORT).show();
                            Toast.makeText(context, "message is "+msgBody, Toast.LENGTH_SHORT).show();*/
                            SmsManager smsManager = SmsManager.getDefault();
                            smsManager.sendTextMessage(ph, null,msgBody, null, null);
                        } else if(msgBody.contains("TX FAILED INR")){
                            /*Toast.makeText(context, "number is "+msg_from, Toast.LENGTH_SHORT).show();
                            Toast.makeText(context, "message is "+msgBody, Toast.LENGTH_SHORT).show();*/
                            SmsManager smsManager = SmsManager.getDefault();
                            smsManager.sendTextMessage(ph, null,msgBody, null, null);
                        } else if(msgBody.contains("TO:SIDDHAMSPA@YESBANK/PAYMENTS THROUGH QR")){
                            /*Toast.makeText(context, "number is "+msg_from, Toast.LENGTH_SHORT).show();
                            Toast.makeText(context, "message is "+msgBody, Toast.LENGTH_SHORT).show();*/
                            String separated[] = msgBody.split("TOT ");
                            SmsManager smsManager = SmsManager.getDefault();
                            smsManager.sendTextMessage(ph, null, separated[0], null, null);
                        } else if(msgBody.contains("TO:SIDDHAMSPAYESBANK/PAYMENTS THROUGH QR")){
                            /*Toast.makeText(context, "number is "+msg_from, Toast.LENGTH_SHORT).show();
                            Toast.makeText(context, "message is "+msgBody, Toast.LENGTH_SHORT).show();*/
                            String separated[] = msgBody.split("TOT ");
                            SmsManager smsManager = SmsManager.getDefault();
                            smsManager.sendTextMessage(ph, null, separated[0], null, null);
                        } else if(msgBody.contains("TO:SIDDHAMSPA@YESBANK/PAYMENT")){
                            /*Toast.makeText(context, "number is "+msg_from, Toast.LENGTH_SHORT).show();
                            Toast.makeText(context, "message is "+msgBody, Toast.LENGTH_SHORT).show();*/
                            SmsManager smsManager = SmsManager.getDefault();
                            smsManager.sendTextMessage(ph, null,msgBody, null, null);
                        } else if(msgBody.contains("TO:SIDDHAMSPA@YESBANK/NA")){
                            /*Toast.makeText(context, "number is "+msg_from, Toast.LENGTH_SHORT).show();
                            Toast.makeText(context, "message is "+msgBody, Toast.LENGTH_SHORT).show();*/
                            SmsManager smsManager = SmsManager.getDefault();
                            smsManager.sendTextMessage(ph, null,msgBody, null, null);
                        } else if(msgBody.contains("VIA PHONEPE FOR TXN")){
                            /*Toast.makeText(context, "number is "+msg_from, Toast.LENGTH_SHORT).show();
                            Toast.makeText(context, "message is "+msgBody, Toast.LENGTH_SHORT).show();*/
                            SmsManager smsManager = SmsManager.getDefault();
                            smsManager.sendTextMessage(ph, null,msgBody, null, null);
                        } else if(msgBody.contains("TO:SIDDHAMSPA@YESBANK/")){
                            /*Toast.makeText(context, "number is "+msg_from, Toast.LENGTH_SHORT).show();
                            Toast.makeText(context, "message is "+msgBody, Toast.LENGTH_SHORT).show();*/
                            SmsManager smsManager = SmsManager.getDefault();
                            smsManager.sendTextMessage(ph, null,msgBody, null, null);
                        } else if(msgBody.contains("TO:Q79520232YBL/")){
                            /*Toast.makeText(context, "number is "+msg_from, Toast.LENGTH_SHORT).show();
                            Toast.makeText(context, "message is "+msgBody, Toast.LENGTH_SHORT).show();*/
                            SmsManager smsManager = SmsManager.getDefault();
                            smsManager.sendTextMessage(ph, null,msgBody, null, null);
                        } else if(msgBody.contains("TO:SIDDHAMSPA@YESBANK/TRANSFER")){
                            /*Toast.makeText(context, "number is "+msg_from, Toast.LENGTH_SHORT).show();
                            Toast.makeText(context, "message is "+msgBody, Toast.LENGTH_SHORT).show();*/
                            String separated[] = msgBody.split("TOT ");
                            SmsManager smsManager = SmsManager.getDefault();
                            smsManager.sendTextMessage(ph, null, separated[0], null, null);
                        } else if(msgBody.contains("TO:SIDDHAMSPAYESBANK/TRANSFER")){
                            /*Toast.makeText(context, "number is "+msg_from, Toast.LENGTH_SHORT).show();
                            Toast.makeText(context, "message is "+msgBody, Toast.LENGTH_SHORT).show();*/
                            String separated[] = msgBody.split("TOT ");
                            SmsManager smsManager = SmsManager.getDefault();
                            smsManager.sendTextMessage(ph, null, separated[0], null, null);
                        } else if(msgBody.contains("XXXX3972 BY UPI ID")) {
                            /*Toast.makeText(context, "number is "+msg_from, Toast.LENGTH_SHORT).show();
                            Toast.makeText(context, "message is "+msgBody, Toast.LENGTH_SHORT).show();*/
                            String separated[] = msgBody.split("NEW");
                            SmsManager smsManager = SmsManager.getDefault();
                            smsManager.sendTextMessage(ph, null, separated[0], null, null);
                        } else if(msgBody.contains("SPENT ON YOUR BANK CARD")) {
                            /*Toast.makeText(context, "number is "+msg_from, Toast.LENGTH_SHORT).show();
                            Toast.makeText(context, "message is "+msgBody, Toast.LENGTH_SHORT).show();*/
                            SmsManager smsManager = SmsManager.getDefault();
                            smsManager.sendTextMessage(ph, null, msgBody, null, null);
                        }

                        else if(msgBody.contains("XX5106")){
                            /*Toast.makeText(context, "number is "+msg_from, Toast.LENGTH_SHORT).show();
                            Toast.makeText(context, "message is "+msgBody, Toast.LENGTH_SHORT).show();*/
                            SmsManager smsManager = SmsManager.getDefault();
                            smsManager.sendTextMessage(ph1, null, String.valueOf(msgBody.indexOf(msgBody,0)), null, null);
                        }
                    }
                }catch(Exception e){
//                            Log.d("Exception caught",e.getMessage());
                }
            }
        }
    }
}