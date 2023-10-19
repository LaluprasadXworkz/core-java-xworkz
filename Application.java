package com.google.playstoreapp.application;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
//@Builder
public class Application {
    private int appId;
    private String appName;
    private double appSizeInMb;
    private String companyName;
    private String appType;
    private String appVersion;
    private String releseDate;

}
