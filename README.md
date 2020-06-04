## Quipper Indonesia - Home Assignment for Test Engineer
Quipper Android Test Engineer Technical Exam.

### Prerequisites
- [Katalon Studio](https://www.katalon.com/) - [Installation and Setup](https://docs.katalon.com/x/HwAM)
- Emulator or Mobile Device
- Get started to perform mobile testing (https://docs.katalon.com/katalon-studio/videos/intro_mobile_app_testing.html)

### Setting Up Your Devices
- Turn on the phone's developer mode (go to Settings > Developer options).
- Connect your Android phone to your computer via a USB cable.
- Confirm if prompted to accept/trust the device.
- In the Developer Options on your mobile user interface, enable:
- USB debugging – Debug mode when USB is connected
- Install via USB – Allow installing apps via USB
- USB debugging (Security Setting) – Allow granting permissions and simulating input via USB debugging
- Install Android SDK: Katalon Studio will detect and ask you to install Android SDK automatically if your current machine doesn't have it. Please allow Katalon Studio to install it in this case.

## Test Scenarios
1. Test whether the app correctly display a video playlist.
2. Test whether the app correctly load a video player when the playlist item is clicked.
3. Test whether the app correctly load a webView component when it's opening the "Campus Search" menu.
4. Test whether the webView component correctly open the ITB web page when user is typing "itb" and clicking the 1st item on the search result.

## Test Cases
### Create a Test Case 
- VideoPlaylist (1 & 2)
- CampusSearch (3 & 4)

 
 ### Execute a Test Suite 
 This Step For Running Test Suite 
1. Connect(Plug in) Mobile device or Running Emulator(make sure the tenji application already installed or exist in device)
2. Open Regress Test Suite
3. Execute a test suite using an Android device (https://docs.katalon.com/katalon-studio/docs/mobile-on-windows.html#verifiying-the-setup)
4. Select your device from the Android Devices list. Click OK. 
5. If your test suite runs successfully, you will see the results in the test reports.

