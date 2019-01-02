source ~/.bash_profile
cd $AUTOMATION_PACKAGE
aapt dumb badging $AUTOMATION_PATH/mobile/android/app-staging-debug.apk
