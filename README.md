## BMI Calculator (Android)

This is a simple **Android BMI (Body Mass Index) calculator app** built with **Java** and **Android Studio**. It allows users to enter their **height in centimeters** and **weight in kilograms**, then calculates their BMI and displays both the numeric value and a basic weight category.

### Features

- **BMI calculation** based on metric units (kg, cm)
- **Input validation** with helpful error messages if fields are empty or invalid
- **Result categorization** into:
  - Underweight
  - Normal weight
  - Overweight
  - Obese
- Simple, single-screen UI with:
  - Two input fields for height and weight
  - A button to trigger the calculation
  - A text area that displays the result

### How It Works

- The user enters:
  - Height in centimeters in the `Height in cm` field
  - Weight in kilograms in the `Weight in kg` field
- When the **Calculate BMI** button is pressed:
  - The app checks that both fields are filled; if not, it shows a Toast message asking the user to enter both values.
  - The height is converted from centimeters to meters.
  - BMI is calculated using the formula:
    \[
    \text{BMI} = \frac{\text{weight (kg)}}{\text{height (m)}^2}
    \]
  - The app then classifies the BMI:
    - \< 18.5 → underweight
    - 18.5–24.9 → normal weight
    - 25–29.9 → overweight
    - ≥ 30 → obese
  - The result is shown in the on-screen label, e.g. `Your BMI: 22.3 - Normal weight`.

### Project Structure (key files)

- `app/src/main/java/com/example/bmi_calculator/MainActivity.java`  
  Contains the main activity logic: reading user input, performing the BMI calculation, and updating the result text.
- `app/src/main/res/layout/activity_main.xml`  
  Defines the UI layout, including the height and weight input fields, the calculate button, and the result text view.
- `app/src/main/AndroidManifest.xml`  
  Declares the application and registers `MainActivity` as the launcher activity.

### Requirements

- **Android Studio** (Arctic Fox or newer recommended)
- **Android SDK** (API level 31 or similar; adjust as needed)
- Java 8+ support enabled in the project

### Running the App

1. **Clone or copy** this project into your Android Studio workspace:
   - `C:\Users\davea\AndroidStudioProjects\BMI_calculator` (or any directory you prefer).
2. Open **Android Studio** and choose **Open an Existing Project**, then select the `BMI_calculator` folder.
3. Let Gradle sync and build the project.
4. Connect an **Android device** with USB debugging enabled or start an **Android Emulator**.
5. Click **Run** (▶) in Android Studio and choose your device/emulator.
6. Once installed:
   - Enter your height (cm) and weight (kg).
   - Tap **Calculate BMI** to see your BMI and category.

### Notes and Limitations

- The BMI categories are simplified and may not fully represent an individual's health status.
- This app does **not** account for factors like age, gender, muscle mass, or medical conditions.
- Use results for **educational purposes only**; consult a healthcare professional for medical advice.

### Possible Improvements

- Support for **imperial units** (feet/inches, pounds).
- More detailed **health guidance** or links to trusted resources.
- Improved **UI/UX** with animations, historical tracking, or charts.
- Localization for additional languages.

