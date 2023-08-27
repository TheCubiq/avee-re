package com.daaw.avee.comp.Visualizer.GraphicPreview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest2;
import com.daaw.avee.comp.AlbumArt.ImageLoadedListener;
import com.daaw.avee.comp.Common.MeterOutputData;
import com.daaw.avee.comp.Common.TrackDurationInfo;
import com.daaw.avee.comp.Visualizer.Graphic.IBufferRenderer;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider;
import com.daaw.avee.comp.Visualizer.Meter;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.daaw.avee.comp.playback.AudioFrameData;
import mdesl.graphics.Texture;
import mdesl.graphics.glutils.FrameBuffer;
/* loaded from: classes.dex */
public class RenderStatePreview implements IRenderState {
    private Bitmap destImage;
    short[] waveSample = {3107, 4026, 8899, 13254, 10129, 5767, 4936, 11796, 17543, 11998, 4178, -1152, -13, 1196, 149, 226, 2126, 6725, 9611, 10205, 7401, 5505, 7147, 7969, 6107, 1240, -23, 2845, 5803, 5207, 1856, 585, 2415, 6603, 5150, 568, -1718, 2843, 11722, 12017, 7702, 2875, 1924, 2767, 3933, 1739, -41, 867, 6556, 14467, 12613, 7590, 4032, 4954, 7620, 10285, 7819, 1988, -215, 1347, 6115, 3579, -1947, -6754, -8200, -5872, -3179, -2814, -5110, -5078, -2252, 2614, 2437, 140, -1487, -5686, -11921, -17261, -16583, -8419, -5691, -8226, -12943, -15243, -14054, -12358, -9846, -6490, -4971, -4644, -3930, -3589, -5270, -7217, -9613, -10485, -8515, -6053, -4158, -5877, -9104, -11326, -10498, -7374, -2747, -1175, -4232, -8403, -10847, -7318, -4681, -2913, -6335, -8988, -9332, -9961, -11888, -17931, -19340, -15587, -6411, -1502, -5072, -9956, -13874, -13186, -14977, -17395, -15249, -10885, -6537, -8450, -11820, -14339, -14914, -17214, -19278, -18689, -16379, -16318, -19418, -20697, -20649, -20263, -21651, -23221, -22042, -19563, -19788, -21254, -21370, -20505, -20092, -19788, -18983, -19220, -18635, -15207, -13011, -17929, -28219, -26476, -17454, -8713, -11777, -20099, -24110, -24015, -19472, -20807, -23979, -24953, -19612, -11835, -10333, -16681, -24923, -24008, -20995, -19411, -23765, -28650, -24371, -16726, -11446, -18061, -25888, -27602, -25298, -23988, -26636, -29740, -29632, -22603, -18627, -18855, -22554, -25620, -23653, -24149, -25919, -27090, -24132, -17465, -15738, -18368, -25963, -29039, -27909, -23434, -20598, -20376, -22689, -24767, -25220, -28231, -30348, -30805, -25564, -17856, -14578, -17662, -24468, -28838, -30868, -31255, -31380, -31743, -31247, -29959, -27403, -26351, -26171, -25760, -24571, -22424, -21094, -19615, -18476, -20279, -24356, -28816, -23772, -15816, -11089, -13966, -19379, -20734, -19707, -17296, -16659, -18305, -23392, -20613, -13322, -8284, -9488, -14359, -16272, -16454, -15257, -15330, -14888, -12650, -8921, -4475, -5246, -7738, -10098, -15727, -20187, -18560, -13420, -9985, -14408, -18023, -18370, -16855, -16171, -17340, -16552, -13419, -8855, -7628, -9351, -11023, -12588, -13988, -17424, -19173, -14370, -10930, -10016, -13698, -16304, -14847, -12798, -10226, -7681, -6426, -7406, -9415, -9007, -5647, -4146, -5071, -7437, -7199, -6090, -5062, -6427, -9095, -10756, -11939, -12623, -14198, -15275, -15015, -12233, -8830, -7572, -8013, -8488, -6879, -5467, -3926, -2283, -314, -130, -1695, -4653, -7512, -9036, -8657, -9275, -10272, -11900, -9817, -4369, -545, -587, -2988, -3314, -3099, -5155, -5283, -3632, -1140, -2745, -6909, -9091, -7698, -5101, -3019, -1368, -1308, -1202, -1203, 530, 2141, 2633, 1474, -751, -3003, -6778, -9884, -8945, -6760, -4096, -4933, -5381, -4660, -6356, -10130, -13750, -12792, -7379, -5294, -5935, -9713, -13428, -13408, -10247, -8098, -8985, -11735, -12478, -8962, -8000, -8072, -5823, -6092, -8698, -11190, -11025, -7247, -5488, -4498, -4118, -4809, -5766, -6507, -6678, -6185, -6303, -6528, -6252, -2541, 1572, 3139, -111, -4880, -7033, -7071, -5598, -4434, -2742, -2742, -5009, -8470, -9846, -8679, -6773, -5546, -6590, -8125, -7454, -5312, -4098, -6050, -8271, -8163, -7317, -5600, -7848, -11179, -13784, -12461, -6530, -4903, -7152, -11660, -11404, -9188, -10435, -13047, -12365, -7060, -4778, -5208, -8948, -12896, -12281, -8900, -5888, -6492, -9398, -11028, -4618, 1384, 118, -4683, -8824, -8646, -6608, -3652, -5287, -8120, -6742, 1141, 6616, 3565, 395, -1977, -3362, -5051, -6098, -5354, -4940, -4326, -2854, -1110, -4087, -8286, -9428, -1666, 5502, 5229, 341, -4255, -2877, -2232, -3956, -4394, -3484, 404, 3510, 4634, 3006, -752, -3604, -2194, 2573, 8212, 8342, 4776, -487, -2949, -2431, 645, 2116, -186, -2594, -2553, 1749, 3616, 3751, 4222, 6947, 9005, 7505, 5443, 3787, 2979, 1807, -1740, -3914, -4355, -3314, -2408, -2918, -5349, -6474, -4727, 2933, 10318, 11480, 6755, 2187, 2485, 6898, 12229, 14080, 12664, 10094, 11295, 15228, 16157, 13969, 11183, 12363, 16252, 17333, 14856, 12044, 12170, 12419, 11692, 10149, 11197, 14667, 16542, 16935, 16744, 16803, 17137, 20403, 23781, 23493, 19426, 17347, 19802, 21808, 23057, 20901, 16716, 14389, 13466, 12919, 13331, 15326, 16897, 17353, 16014, 14786, 20532, 25224, 24852, 20740, 16996, 19244, 20212, 19411, 16821, 16304, 20975, 25677, 28387, 25520, 23431, 23326, 24982, 26559, 27815, 29696, 30162, 27905, 25546, 25393, 30483, 32504, 30694, 25015, 20873, 19609, 18429, 17485, 17945, 19566, 21917, 22137, 18905, 13688, 16190, 22453, 28114, 27979, 25173, 25129, 25478, 25019, 22524, 20588, 20999, 23607, 25468, 23165, 22058, 22737, 23834, 24680, 24791, 27034, 30035, 32152, 31979, 30101, 26780, 24034, 22210, 21405, 21935, 23673, 23736, 22072, 19140, 18290, 19620, 22750, 23550, 20149, 18027, 17080, 17587, 16592, 14110, 12828, 12702, 13366, 12584, 11718, 10689, 10709, 11787, 13100, 13832, 12791, 10572, 8689, 7086, 6071, 5619, 5936, 5664, 4690, 4556, 5563, 7286, 8434, 9582, 11333, 12908, 14228, 14987, 15120, 15074, 14604, 15260, 16763, 18026, 18742, 19117, 16964, 13288, 12481, 15109, 20832, 21277, 18167, 14313, 12562, 13191, 14573, 15499, 14587, 12836, 11720, 12168, 12446, 12737, 12794, 14341, 17483, 20536, 22537, 21618, 20791, 19246, 17232, 13086, 8210, 7543, 10074, 15296, 15647, 13006, 10712, 10204, 11011, 10887, 9722, 8043, 9206, 10958, 13302, 12737, 9234, 4483, 806, 206, 5001, 8897, 8148, 6652, 6271, 8831, 10253, 10353, 9012, 8741, 10680, 13278, 14892, 12609, 10962, 10695, 10431, 10872, 12028, 14015, 16512, 17687, 17358, 15514, 14122, 12790, 11470, 11522, 10985, 10531, 8961, 8043, 8000, 8726, 9330, 8278, 7264, 5574, 7757, 10654, 10687, 8366, 4480, 2966, 3382, 4075, 1464, -1763, -2520, 30, 2792, 852, -794, -444, 1934, 4168, 4358, 3822, 3896, 6999, 7761, 6017, 2433, 435, 395, -519, -842, 958, 1236, -1209, -5840, -9932, -12784, -13430, -13050, -12078, -11227, -9631, -6206, -3591, -2641, -1513, 1132, 5561, 6562, 4948, 2250, 933, 1370, 2428, 3362, 3511, 3849, 4223, 4113, 2797, 2712, 6334, 10493, 12030, 11137, 9999, 10314, 8639, 5909, 3593, 4296, 6791, 6933, 5395, 3286, 3159, 4636, 5557, 6813, 8452, 9580, 9195, 7448, 6966, 7734, 9867, 9277, 7460, 7182, 6912, 5932, 3447, 2782, 6000, 9593, 11798, 11004, 9758, 8837, 8804, 7880, 5495, 5520, 8078, 11906, 12308, 9628, 7027, 6352, 8270, 10184, 9601, 6272, 4810, 6790, 11554, 11976, 7852, 4222, 3047, 3958, 5638, 6268, 5395, 3652, 2151, 1270, 1567, 2915, 3574, 2478, -1198, -1575, -113, 1199, 1572, 2515, 4923, 8645, 12850, 12535, 10167, 7661, 6798, 7314, 6512, 5125, 2807, 1158, 2732, 7161, 10456, 12472, 11781, 10160, 7977, 6090, 5967, 8758, 9712, 7917, 6081, 5371, 6109, 8736, 10839, 8544, 7619, 8383, 10253, 9275, 5433, 4422, 5809, 6095, 2748, -1635, -4469, -3005, 233, 2061, 3058, 2728, 2944, 1625, 306, 74, 130, -2840, -4389, -3547, -1513, -1000, -4433, -7525, -10504, -13507, -13995, -11793, -6212, -1121, 508, -331, -2959, -4455, -4271, -3588, -4698, -4988, -3910, -1782, -1121, -4484, -7463, 
    -9706};
    InternalVisualizationDataProvider internalDataProvider = new InternalVisualizationDataProvider() { // from class: com.daaw.avee.comp.Visualizer.GraphicPreview.RenderStatePreview.1
        @Override // com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider
        public void onOffScreenContentRendered(Texture texture, boolean z, String str) {
        }

        @Override // com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider
        public void onRequestAlbumArtPathAndBitmap(ImageLoadedListener imageLoadedListener, AlbumArtRequest2 albumArtRequest2) {
        }

        @Override // com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider
        public int onRequestAntiAliasingValue() {
            return 0;
        }

        @Override // com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider
        public int onRequestAudioProcessMultiThreadValue() {
            return 0;
        }

        @Override // com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider
        public int onRequestOverrideAudioFrameSamplesInCount() {
            return 0;
        }

        @Override // com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider
        public TrackDurationInfo onRequestTrackDurationInfo() {
            return null;
        }

        @Override // com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider
        public boolean onRequestUseHighQualityBlur() {
            return false;
        }

        @Override // com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider
        public AlbumArtRequest onRequestsAlbumArtPath() {
            return null;
        }

        @Override // com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider
        public String onRequestsMeasureText(String str) {
            return "";
        }

        @Override // com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider
        public void onThemeChanged() {
        }

        @Override // com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider
        public AudioFrameData onRequestSoundVisualizationData(int i) {
            return RenderStatePreview.this.getSoundVisualizationData(i);
        }

        @Override // com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider
        public Vec2f onRequestMeasureVec2f(String str, Vec2f vec2f, Vec2f vec2f2, MeterOutputData meterOutputData, IRenderState iRenderState) {
            return VisualizerViewCore.onRequestMeasureVec2f.invoke(str, vec2f, vec2f2, meterOutputData, iRenderState, vec2f2);
        }

        @Override // com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider
        public int onRequestConvertDpToPx(int i) {
            return VisualizerViewCore.onRequestConvertDpToPx.invoke(Integer.valueOf(i), Integer.valueOf(i)).intValue();
        }
    };
    private Meter meter = new Meter(this);
    private BufferRendererPreview bufferRenderer = new BufferRendererPreview();
    private RenderResourcesPreview resource = new RenderResourcesPreview(this.meter, this.internalDataProvider);

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public void bindFrameBuffer(FrameBuffer frameBuffer) {
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public void frameResourcesLoadingAdd() {
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public float getFrameTimeF() {
        return 0.1f;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public boolean getMultiThread() {
        return false;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public boolean getRenderEdges() {
        return false;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public boolean getRenderEdgesPaths() {
        return false;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public float getTotalFrameTimeF() {
        return 1.0f;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public void setBlendMode(int i) {
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public void setTextureWrapping(int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AudioFrameData getSoundVisualizationData(int i) {
        AudioFrameData audioFrameData = new AudioFrameData();
        audioFrameData.init(44100, 2, i, i);
        float f = 0.0f;
        for (int i2 = 0; i2 < audioFrameData.getBufferSizeForCapture(); i2++) {
            short[] sArr = this.waveSample;
            short s = (short) (sArr[i2 % sArr.length] * 1 * 1);
            audioFrameData.pcmBuffer[audioFrameData.pcmBufferChannelCount * i2] = s;
            audioFrameData.pcmBuffer[(audioFrameData.pcmBufferChannelCount * i2) + 1] = s;
            if (audioFrameData.minPcmValue > s) {
                audioFrameData.minPcmValue = s;
            }
            if (audioFrameData.maxPcmValue < s) {
                audioFrameData.maxPcmValue = s;
            }
            f += audioFrameData.pcmBuffer[audioFrameData.pcmBufferChannelCount * i2] / 255.0f;
        }
        audioFrameData.rms = f / audioFrameData.getBufferSizeForCapture();
        audioFrameData.valid = true;
        return audioFrameData;
    }

    public void setDestBitmap(Bitmap bitmap) {
        this.destImage = bitmap;
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        this.bufferRenderer.setDestCanvas(canvas);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public IRenderState.IRenderResources getRes() {
        return this.resource;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public IBufferRenderer getBufferRenderer() {
        return this.bufferRenderer;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public int getScreenHeight() {
        Bitmap bitmap = this.destImage;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return 0;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public int getScreenWidth() {
        Bitmap bitmap = this.destImage;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return 0;
    }

    public void onFrameStart() {
        this.meter.onFrameStart();
    }
}
