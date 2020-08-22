# 安卓多模块SDK打包maven配置Demo

## 缘起
在工作中需要对一个模块化开发的安卓SDK进行打包，在实现了[功能](https://shingkit.me/2020-08-08/sdk-componient.html)后找寻更好的方案。
这个Demo是在maven上的探索。

## 目前情况
2020-08-22
- [x] 可实现开源多模块sdk发布
- [ ] 多模块混淆

## 步骤
1. 构建项目
```bash
./gradlew assembleRelease
```
2. 生成aar并推送到maven仓库
```bash
./gradlew publishReleasePublicationToShingkitRepository
```
代码里配置的是本地目录，仅用作测试  

3. 使用maven依赖测试
修改`app/build.gradle`
```gradle

dependencies {
    ...

    implementation "me.shingkit.sdk:ui:${rootProject.ext.LIBRARY_VERSION}"
//    implementation project(path: ':sdk:ui')
}
```

