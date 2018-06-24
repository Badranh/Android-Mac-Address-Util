# Android-Mac-Address-Util


# USAGE 

```
MacAddress.getMacAddr();
```
it will return the mac address of the android phone in a string  00:00:00:00:00 will be returned in case of failure

# How to add to your app 

add this to your dependencies in build.gradle file

```
implementation 'com.github.Badranh:Android-Mac-Address-Util:0.1.0'
```
Add it in your root build.gradle at the end of repositories:

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
# Changes:
6/25/2018:
- Uploaded the library

License : MIT
