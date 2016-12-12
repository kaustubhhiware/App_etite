# App_etite
Android apps learning dump
My phone configuration is SDK 22(5.1), so I build my app for the same configuration.

I'll be folllowing basic thenewboston's tutorial on [youtube](https://www.youtube.com/watch?v=QAbQgLGKd3Y&list=PL6gx4Cwl9DGBsvRxJJOzG4r4k_zLKrnxl) first, and then proceed to other resources.(A total of 77 videos)

Most of the app folders are half-baked, not stand alone completed apps. The completed apps deserve a repo of their own, links to which are mentioned separately.

Cheap tricks to get your app working in Android studio 2.2.2 :

Standard problem : `Error:Failed to resolve: junit:junit:4.12
Show in Project Structure dialog`

The hack for this is to write the following text in build.gradle file :
<pre style="background: rgb(238, 238, 238); border: 1px solid rgb(204, 204, 204); padding: 5px 10px;">// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        maven { url 'http://repo1.maven.org/maven2' }
        jcenter()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:2.2.2'

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        maven { url 'http://repo1.maven.org/maven2' }
        jcenter()
    }
}

task clean(type: Delete) {
    delete rootProject.buildDir
} </pre>

Internet connection may be required for builds if it needs to fetch data from maven.org

[Cheat sheet](AndroidCheatSheet.pdf) : `Help > Default keymap references`

The basic code conventions are in [app1](app1/).
[Activity state diagram](activity-states.png) upto video 10.

Lesson 11 onwards - [Hamblaster](Hamblaster/)

Starts with no activity.

Lesson 13 onwards - [Allison](Allison/).
