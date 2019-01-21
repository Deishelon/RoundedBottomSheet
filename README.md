# Rounded Bottom Sheet - Android


|  [![](https://github.com/Deishelon/RoundedBottomSheet/raw/master/screenshots/Rounded-Example-400_framed.png)](https://github.com/Deishelon/RoundedBottomSheet/raw/master/screenshots/Rounded-Example-Full_framed.png)   |  [![](https://github.com/Deishelon/RoundedBottomSheet/raw/master/screenshots/def_framed_400.png)](https://github.com/Deishelon/RoundedBottomSheet/raw/master/screenshots/Rounded-Example-Full_framed.png)  |
| ------------- |:-------------:|


## Install

#### Step 1. Add the JitPack repository to your build file
```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

#### Step 2. Add the dependency
```gradle
dependencies {
    implementation 'com.github.Deishelon:RoundedBottomSheet:1.0.0'
}
```

## Usage - DialogFragment

Simply extend `RoundedBottomSheetDialogFragment`, inflate your layout and show it

#### Example

```kotlin
import com.deishelon.roundedbottomsheet.RoundedBottomSheetDialogFragment

class MyRoundedBottomSheet: RoundedBottomSheetDialogFragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.dialog_2_my_rounded_bottom_sheet, container, false)
    }
}
```

## Usage - Dialog

Simply extend or create an instance of `RoundedBottomSheetDialog` , inflate your layout and show it

#### Example

```kotlin
import com.deishelon.roundedbottomsheet.RoundedBottomSheetDialog

val mBottomSheetDialog = RoundedBottomSheetDialog(context!!)
val sheetView = layoutInflater.inflate(R.layout.dialog_2_my_rounded_bottom_sheet, null)
mBottomSheetDialog.setContentView(sheetView)
mBottomSheetDialog.show()
```

## Customization

We provide a few options to customize, to make sure your Bottom Sheet will feel native to your app
To change default values, just override the recourse you wish, like so:

```xml
<color name="roundedBottomSheetPrimaryBackground">#F06292</color>
```

&nbsp;

| Recourse                                                  | Description                   | Default value     |
| -------------                                             | -------------                 | -------------     |
| @color/roundedBottomSheetPrimaryBackground                | Background colour             | #FFFFFFFF         |
| @color/roundedBottomSheetPrimaryNavigationBarColor        | Navigation bar colour         | #FFFFFFFF         |
| @dimen/roundedBottomSheetCornerRadius                     | Bottom sheet corner radius    | 16dp              |
| @dimen/roundedBottomSheetCornerRadiusTopPadding           | Top padding                   | 8dp               |
