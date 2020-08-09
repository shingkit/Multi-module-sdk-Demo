# 安卓多模块SDK打包maven配置Demo

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

