//
// Created by Skbhati on 20-11-2016.
//


#include <string.h>
#include <jni.h>

JNIEXPORT jstring JNICALL
                 Java_com_metroinfrasys_ndktutorialtwo_MainActivity_getMsgFromJni(JNIEnv *env,
                                                                                  jobject instance)
{

    // TODO


    return (*env)->NewStringUTF(env, "Hello world!");
}