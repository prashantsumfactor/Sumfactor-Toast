# Sumfactor-Toast

Toast Library for different type of pop-up message like simple, errors or warnings.

> Step 1. Add the JitPack repository to your build file

```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```

> Step 2. Add the dependency

 ```gradle
 dependencies {
		implementation 'com.github.prashantsumfactor:Sumfactor-Toast:v1.0.0'
	}
  ```

> Step 3. Now use it directly in your code like

```
   For Simple / Normal : 
   MyToast.simpleToast(context = this, simpleMessage = "Toast Message")
   
   For Error toast :  
   MyToast.errorToast(context =this, errorMessage = "error on uploadin")
   
   For Warning toast :
   MyToast.warningToast(context =this, warningMessage = "use 'name' in upper case")
   
   You can set toast position top/center/bottom
             *    By default Toast position was set to bottom e.g positionDefault
             *    MyToast.positionTop : for align Top
             *    MyToast.positionCenter : for align Center
   
   example - MyToast.simpleToast(context = this, simpleMessage = "Toast Message", position = MyToast.positionTop) 
```