package com.jbirdvegas.mgerrit.message;

import android.content.Intent;

import com.jbirdvegas.mgerrit.objects.GerritMessage;

/*
 * Copyright (C) 2015 Android Open Kang Project (AOKP)
 *  Author: Evan Conway (P4R4N01D), 2015
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
public class ChangeDiffLoaded extends GerritMessage {

    private final String mChangeDiff;
    private final int mChangeNumber;
    private final int mPatchsetNumber;

    public ChangeDiffLoaded(Intent intent, int queueId, String changeDiff, int changeNo, int patchsetNo) {
        super(intent, queueId);
        this.mChangeDiff = changeDiff;
        this.mChangeNumber = changeNo;
        this.mPatchsetNumber = patchsetNo;
    }

    public String getDiff() { return mChangeDiff; }

    public int getChangeNumber() {
        return mChangeNumber;
    }

    public int getPatchsetNumber() {
        return mPatchsetNumber;
    }
}
