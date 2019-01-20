# Rounded Bottom Sheet - Android

[![](https://github.com/Deishelon/RoundedBottomSheet/raw/master/screenshots/Rounded-Example-400_framed.png)](https://github.com/Deishelon/RoundedBottomSheet/raw/master/screenshots/Rounded-Example-Full_framed.png)

## Install

#### Step 1. Add the JitPack repository to your build file
```
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

#### Step 2. Add the dependency
```
dependencies {
    implementation 'com.github.Deishelon:RoundedBottomSheet:Tag'
}
```

## Usage

Simply extend `RoundedBottomSheetDialogFragment`, inflate your layout and show it

### Usage - Example

```
import com.deishelon.roundedbottomsheet.RoundedBottomSheetDialogFragment

class MyRoundedBottomSheet: RoundedBottomSheetDialogFragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.dialog_2_my_rounded_bottom_sheet, container, false)
    }
}
```

To show your bottom sheet:

```
val myRoundedBottomSheet = MyRoundedBottomSheet()
myRoundedBottomSheet.show(supportFragmentManager, myRoundedBottomSheet.tag)
```

## Customization

We provide a few options to customize, to make sure your Bottom Sheet will feel native to your app
To change default values, just override the recourse you wish, like so:

```
<color name="roundedBottomSheetPrimaryBackground">#F06292</color>
```

&nbsp;

| Recourse                                                  | Description                   | Default value     |
| -------------                                             | -------------                 | -------------     |
| @color/roundedBottomSheetPrimaryBackground                | Background colour             | #FFFFFFFF         |
| @color/roundedBottomSheetPrimaryNavigationBarColor        | Navigation bar colour         | #FFFFFFFF         |
| @dimen/roundedBottomSheetCornerRadius                     | Bottom sheet corner radius    | 16dp              |
| @dimen/roundedBottomSheetCornerRadiusTopPadding           | Top padding                   | 8dp               |
