package com.fastcampus.springrunner.divelog.core.diveresort.application;

import com.fastcampus.springrunner.divelog.core.diveresort.domain.DiveResortRepository;
import lombok.RequiredArgsConstructor;

/*
* @author   Springrunner.kr@gmail.com
 */
@RequiredArgsConstructor
public class DiveResortManager implements DiveResortFider, DiverResortEditor{
    private final DiveResortRepository diveResortRepository;
}
