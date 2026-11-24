FINDERS CRM - FREE ANDROID PACKAGE
==================================

This package contains:
1) A free PWA launcher shell for GitHub Pages.
2) An Android Studio project.
3) A GitHub Actions workflow that can build a debug APK online for free
   after you upload this repository to GitHub.

The existing CRM remains on Google Apps Script and Google Sheets.
The package does not change your Code.gs or Mobile.html.

CRM URL:
https://script.google.com/macros/s/AKfycbySvkhLrIl_krpoZvJEkLX3QDCYeBw0HOV_E5gsK0xgxL9DTceYsyrvVes5_-NZOVuMtg/exec?view=mobile

PUBLISH PWA ON FREE GITHUB PAGES
--------------------------------
1. Create a free GitHub account if you do not already have one.
2. Create a PUBLIC repository, e.g. finders-crm-mobile.
3. Upload all files and folders from this package to the repository ROOT.
   Important: index.html, manifest.webmanifest, sw.js and icons must be at root.
4. Open repository Settings > Pages.
5. Choose "Deploy from a branch", branch "main", folder "/ (root)", then Save.
6. After GitHub publishes the site, open its URL on Android Chrome:
   https://YOUR-USERNAME.github.io/finders-crm-mobile/
7. Chrome menu > Install app / Add to Home screen.

BUILD APK FOR FREE WITHOUT ANDROID STUDIO
-----------------------------------------
1. Upload the complete package to the same public GitHub repository.
2. Open the repository's Actions tab.
3. Select "Build FINDERS CRM APK".
4. Press "Run workflow".
5. When the workflow finishes, open the run and download the artifact named
   FINDERS-CRM-debug-APK.
6. Extract app-debug.apk, transfer it to Android, and install it.
   Android may ask permission to install from the browser/file manager.

IMPORTANT TECHNICAL LIMITATION
------------------------------
This first version is a launcher, not a fully embedded native CRM screen:
- PWA opens the original Apps Script URL when Open CRM is tapped.
- APK launches the CRM in a Chrome Custom Tab.
- This preserves the Google sign-in browser session and avoids embedding the
  Apps Script page in an external iframe or weakening its frame protections.
- The CRM needs internet. The launcher shell alone can open offline.
- No CRM data is cached by the service worker.

Before employee rollout, test Google login, dashboard, feedback save/edit,
navigation and WhatsApp on the actual Android phone.
