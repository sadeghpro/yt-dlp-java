# yt-dlp-java

A simple java wrapper for [yt-dlp](https://github.com/yt-dlp/yt-dlp) executable

# Prerequisite

:warning: yt-dlp should be installed and available in your `$PATH.

[How to properly install yt-dlp executable](https://github.com/yt-dlp/yt-dlp#installation)

Otherwise you will get this error :

`Cannot run program "yt-dlp" (in directory "/Users/my/beautiful/path"): error=2, No such file or directory`

# Usage

## Installation

### Maven

```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

```
<dependency>
    <groupId>com.github.sadeghpro</groupId>
    <artifactId>yt-dlp-java</artifactId>
    <version>1.0.0</version>
</dependency>
```


### Gradle

```
dependencies {
    implementation 'com.github.sadeghpro:yt-dlp-java:1.0.0'
}
```

```
repositories {
    maven { url 'https://jitpack.io' }
}
```

## Make request

```java
// Video url to download
String videoUrl = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";

// Destination directory
String directory = System.getProperty("user.home");

// Build request
YtDlpRequest request = new YtDlpRequest(videoUrl, directory);
request.setOption("output", "%(id)s");	// --output "%(id)s"

// Make request and return response
YtDlpResponse response = YtDlp.execute(request);

// Response
String stdOut = response.getOut(); // Executable output
```

You may also specify a callback to get notified about the progress of the download:

```java
YtDlpResponse response = YtDlp.execute(request, new DownloadProgressCallback() {
    @Override
        public void onProgressUpdate(float progress, long etaInSeconds) {
            System.out.println(String.valueOf(progress) + "%");
        }
});
```

## Java Objects
Provides Typesafe representations of yt-dlp data callbacks to more securely access and see what data is available when using a predefined helper methods including video and playlist data.

```java
// Request
Optional<VideoInfo> videoInfo = YtDlp.getVideoInfo("https://www.youtube.com/watch?v=dQw4w9WgXcQ");

// Accesing the optional if a valid url was given
videoInfo.ifPresent(info -> {
   // Accessing data typesafe
   String channelID = info.getChannelId();
   String videoDescription = info.getDescription();
   Map<String, List<Caption>> videoCaptions = info.getAutomaticCaptions();
  }
);
```

# Links
* [yt-dlp documentation](https://github.com/yt-dlp/yt-dlp)
