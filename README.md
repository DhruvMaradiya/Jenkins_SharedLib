## Jenkins Shared Library

*   Shared libraries in Jenkins Pipelines are reusable pieces of code that can be organized into functions and classes.
*   These libraries allow you to encapsulate common logic, making it easier to maintain and share across multiple pipelines and projects.
*   Shared library must be inside the **vars** directory in your github repository
*   Shared library uses **groovy** syntax and file name ends with **.groovy** extension.

#

## How to create and use shared library in Jenkins.

### How to create Shared library

Login to your Jenkins dashboard. Jenkins Installation

Go to **Manage Jenkins** --> **System** and search for **Global Trusted Pipeline Libraries**.

*   ![](https://github.com/DevMadhup/Jenkins_SharedLib/blob/main/assests/Sharedlib-config-1.png)

**Name:** Shared   
  
**Default version:** \<branch name="">  
**Project repository:** https://github.com/DevMadhup/Jenkins_SharedLib.git   
 

![](https://github.com/DevMadhup/Jenkins_SharedLib/blob/main/assests/Sharedlib-config-2.png)

#

### How to use it in Jenkins pipeline

*   Go to your declarative pipeline
*   Add **@Library('Shared') \_** at the very first line of your jenkins pipeline.![](https://github.com/DevMadhup/Jenkins_SharedLib/blob/main/assests/shared-lib-in-pipeline.png)

**Note:** @Library() \_ is the syntax to use shared library.