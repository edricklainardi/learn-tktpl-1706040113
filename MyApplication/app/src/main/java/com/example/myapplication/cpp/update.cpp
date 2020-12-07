//
// Created by Edrick on 12/7/2020.
//

#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_myapplication_ui_FirstFragment_confirmation(JNIEnv *env, jobject /* this */, jstring s2) {
/*    jstring s1  = (*env)->NewStringUTF("You just entered a quote by ");

    jbyte *s1x  = (*env)->GetStringUTFChars(s1, NULL);
    jbyte *s2x  = (*env)->GetStringUTFChars(s2, NULL);

    char *sall  = malloc(strlen(s1x) + strlen(s2x) + 1);
    strcpy(sall, s1x);
    strcat(sall, s2x);

    jstring retval = (*env)->NewStringUTF(sall);

    (*env)->ReleaseStringUTFChars(s1, s1x);
    (*env)->ReleaseStringUTFChars(s2, s2x);
    free(sall);

    return retval;*/

    return s2;
}