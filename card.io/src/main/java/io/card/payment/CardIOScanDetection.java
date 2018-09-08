package io.card.payment;

import android.app.Activity;
import android.graphics.Bitmap;

/**
 * Created by Serfer on 08.09.2018.
 */

public interface CardIOScanDetection {
    Activity getActivity();
    void onFirstFrame(int orientation);
    void onCardDetected(Bitmap detectedBitmap, DetectionInfo dInfo);
    void onEdgeUpdate(DetectionInfo dInfo);
}
