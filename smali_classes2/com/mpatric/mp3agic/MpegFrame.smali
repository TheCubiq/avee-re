.class public Lcom/mpatric/mp3agic/MpegFrame;
.super Ljava/lang/Object;
.source "MpegFrame.java"


# static fields
.field private static final BITMASK_BITRATE:J = 0xf000L

.field private static final BITMASK_CHANNEL_MODE:J = 0xc0L

.field private static final BITMASK_COPYRIGHT:J = 0x8L

.field private static final BITMASK_EMPHASIS:J = 0x3L

.field private static final BITMASK_FRAME_SYNC:J = 0xffe00000L

.field private static final BITMASK_LAYER:J = 0x60000L

.field private static final BITMASK_MODE_EXTENSION:J = 0x30L

.field private static final BITMASK_ORIGINAL:J = 0x4L

.field private static final BITMASK_PADDING:J = 0x200L

.field private static final BITMASK_PRIVATE:J = 0x100L

.field private static final BITMASK_PROTECTION:J = 0x10000L

.field private static final BITMASK_SAMPLE_RATE:J = 0xc00L

.field private static final BITMASK_VERSION:J = 0x180000L

.field public static final CHANNEL_MODE_DUAL_MONO:Ljava/lang/String; = "Dual mono"

.field public static final CHANNEL_MODE_JOINT_STEREO:Ljava/lang/String; = "Joint stereo"

.field public static final CHANNEL_MODE_MONO:Ljava/lang/String; = "Mono"

.field public static final CHANNEL_MODE_STEREO:Ljava/lang/String; = "Stereo"

.field public static final EMPHASIS_CCITT_J_17:Ljava/lang/String; = "CCITT J.17"

.field public static final EMPHASIS_NONE:Ljava/lang/String; = "None"

.field public static final EMPHASIS__50_15_MS:Ljava/lang/String; = "50/15 ms"

.field private static final FRAME_DATA_LENGTH:I = 0x4

.field private static final FRAME_SYNC:I = 0x7ff

.field public static final MODE_EXTENSION_BANDS_12_31:Ljava/lang/String; = "Bands 12-31"

.field public static final MODE_EXTENSION_BANDS_16_31:Ljava/lang/String; = "Bands 16-31"

.field public static final MODE_EXTENSION_BANDS_4_31:Ljava/lang/String; = "Bands 4-31"

.field public static final MODE_EXTENSION_BANDS_8_31:Ljava/lang/String; = "Bands 8-31"

.field public static final MODE_EXTENSION_INTENSITY_M_S_STEREO:Ljava/lang/String; = "Intensity & M/S stereo"

.field public static final MODE_EXTENSION_INTENSITY_STEREO:Ljava/lang/String; = "Intensity stereo"

.field public static final MODE_EXTENSION_M_S_STEREO:Ljava/lang/String; = "M/S stereo"

.field public static final MODE_EXTENSION_NA:Ljava/lang/String; = "n/a"

.field public static final MODE_EXTENSION_NONE:Ljava/lang/String; = "None"

.field public static final MPEG_LAYERS:[Ljava/lang/String;

.field public static final MPEG_LAYER_1:Ljava/lang/String; = "I"

.field public static final MPEG_LAYER_2:Ljava/lang/String; = "II"

.field public static final MPEG_LAYER_3:Ljava/lang/String; = "III"

.field public static final MPEG_VERSION_1_0:Ljava/lang/String; = "1.0"

.field public static final MPEG_VERSION_2_0:Ljava/lang/String; = "2.0"

.field public static final MPEG_VERSION_2_5:Ljava/lang/String; = "2.5"


# instance fields
.field private bitrate:I

.field private channelMode:Ljava/lang/String;

.field private copyright:Z

.field private emphasis:Ljava/lang/String;

.field private layer:I

.field private modeExtension:Ljava/lang/String;

.field private original:Z

.field private padding:Z

.field private privat:Z

.field private protection:Z

.field private sampleRate:I

.field private version:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "I"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "II"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "III"

    aput-object v2, v0, v1

    .line 11
    sput-object v0, Lcom/mpatric/mp3agic/MpegFrame;->MPEG_LAYERS:[Ljava/lang/String;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(BBBB)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    invoke-static {p1, p2, p3, p4}, Lcom/mpatric/mp3agic/BufferTools;->unpackInteger(BBBB)I

    move-result p1

    int-to-long p1, p1

    .line 66
    invoke-direct {p0, p1, p2}, Lcom/mpatric/mp3agic/MpegFrame;->setFields(J)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    array-length v0, p1

    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    .line 60
    aget-byte v0, p1, v0

    const/4 v1, 0x1

    aget-byte v1, p1, v1

    const/4 v2, 0x2

    aget-byte v2, p1, v2

    const/4 v3, 0x3

    aget-byte p1, p1, v3

    invoke-static {v0, v1, v2, p1}, Lcom/mpatric/mp3agic/BufferTools;->unpackInteger(BBBB)I

    move-result p1

    int-to-long v0, p1

    .line 61
    invoke-direct {p0, v0, v1}, Lcom/mpatric/mp3agic/MpegFrame;->setFields(J)V

    return-void

    .line 59
    :cond_0
    new-instance p1, Lcom/mpatric/mp3agic/InvalidDataException;

    const-string v0, "Mpeg frame too short"

    invoke-direct {p1, v0}, Lcom/mpatric/mp3agic/InvalidDataException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private setBitRate(I)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    move-object/from16 v0, p0

    .line 123
    iget-object v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->version:Ljava/lang/String;

    const-string v2, "1.0"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/16 v6, 0x70

    const/16 v7, 0x50

    const/16 v10, 0x100

    const/16 v11, 0xe0

    const/16 v12, 0xc0

    const/16 v13, 0xa0

    const/16 v14, 0x80

    const/16 v15, 0x60

    const/16 v2, 0x40

    const/16 v3, 0x20

    if-eqz v1, :cond_2

    .line 124
    iget v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->layer:I

    const/16 v9, 0x180

    const/16 v8, 0x140

    if-ne v1, v5, :cond_0

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    const/16 v1, 0x1c0

    .line 139
    iput v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :pswitch_1
    const/16 v1, 0x1a0

    .line 138
    iput v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 137
    :pswitch_2
    iput v9, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :pswitch_3
    const/16 v1, 0x160

    .line 136
    iput v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 135
    :pswitch_4
    iput v8, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :pswitch_5
    const/16 v1, 0x120

    .line 134
    iput v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 133
    :pswitch_6
    iput v10, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 132
    :pswitch_7
    iput v11, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 131
    :pswitch_8
    iput v12, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 130
    :pswitch_9
    iput v13, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 129
    :pswitch_a
    iput v14, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 128
    :pswitch_b
    iput v15, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 127
    :pswitch_c
    iput v2, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 126
    :pswitch_d
    iput v3, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :cond_0
    if-ne v1, v4, :cond_1

    packed-switch p1, :pswitch_data_1

    goto/16 :goto_0

    .line 156
    :pswitch_e
    iput v9, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 155
    :pswitch_f
    iput v8, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 154
    :pswitch_10
    iput v10, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 153
    :pswitch_11
    iput v11, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 152
    :pswitch_12
    iput v12, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 151
    :pswitch_13
    iput v13, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 150
    :pswitch_14
    iput v14, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 149
    :pswitch_15
    iput v6, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 148
    :pswitch_16
    iput v15, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 147
    :pswitch_17
    iput v7, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 146
    :pswitch_18
    iput v2, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :pswitch_19
    const/16 v1, 0x38

    .line 145
    iput v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :pswitch_1a
    const/16 v1, 0x30

    .line 144
    iput v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 143
    :pswitch_1b
    iput v3, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :cond_1
    const/4 v4, 0x3

    if-ne v1, v4, :cond_6

    packed-switch p1, :pswitch_data_2

    goto/16 :goto_0

    .line 173
    :pswitch_1c
    iput v8, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 172
    :pswitch_1d
    iput v10, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 171
    :pswitch_1e
    iput v11, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 170
    :pswitch_1f
    iput v12, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 169
    :pswitch_20
    iput v13, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 168
    :pswitch_21
    iput v14, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 167
    :pswitch_22
    iput v6, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 166
    :pswitch_23
    iput v15, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 165
    :pswitch_24
    iput v7, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 164
    :pswitch_25
    iput v2, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :pswitch_26
    const/16 v1, 0x38

    .line 163
    iput v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :pswitch_27
    const/16 v1, 0x30

    .line 162
    iput v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :pswitch_28
    const/16 v1, 0x28

    .line 161
    iput v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 160
    :pswitch_29
    iput v3, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 176
    :cond_2
    iget-object v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->version:Ljava/lang/String;

    const-string v8, "2.0"

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->version:Ljava/lang/String;

    const-string v8, "2.5"

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 177
    :cond_3
    iget v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->layer:I

    const/16 v8, 0x90

    if-ne v1, v5, :cond_4

    packed-switch p1, :pswitch_data_3

    goto :goto_0

    .line 192
    :pswitch_2a
    iput v10, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 191
    :pswitch_2b
    iput v11, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 190
    :pswitch_2c
    iput v12, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :pswitch_2d
    const/16 v1, 0xb0

    .line 189
    iput v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 188
    :pswitch_2e
    iput v13, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 187
    :pswitch_2f
    iput v8, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 186
    :pswitch_30
    iput v14, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 185
    :pswitch_31
    iput v6, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 184
    :pswitch_32
    iput v15, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 183
    :pswitch_33
    iput v7, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 182
    :pswitch_34
    iput v2, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :pswitch_35
    const/16 v1, 0x38

    .line 181
    iput v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :pswitch_36
    const/16 v1, 0x30

    .line 180
    iput v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 179
    :pswitch_37
    iput v3, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :cond_4
    if-eq v1, v4, :cond_5

    const/4 v4, 0x3

    if-ne v1, v4, :cond_6

    :cond_5
    packed-switch p1, :pswitch_data_4

    goto :goto_0

    .line 209
    :pswitch_38
    iput v13, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 208
    :pswitch_39
    iput v8, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 207
    :pswitch_3a
    iput v14, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 206
    :pswitch_3b
    iput v6, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 205
    :pswitch_3c
    iput v15, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 204
    :pswitch_3d
    iput v7, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 203
    :pswitch_3e
    iput v2, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :pswitch_3f
    const/16 v1, 0x38

    .line 202
    iput v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :pswitch_40
    const/16 v1, 0x30

    .line 201
    iput v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :pswitch_41
    const/16 v1, 0x28

    .line 200
    iput v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 199
    :pswitch_42
    iput v3, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :pswitch_43
    const/16 v1, 0x18

    .line 198
    iput v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :pswitch_44
    const/16 v1, 0x10

    .line 197
    iput v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    :pswitch_45
    const/16 v1, 0x8

    .line 196
    iput v1, v0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return-void

    .line 213
    :cond_6
    :goto_0
    new-instance v1, Lcom/mpatric/mp3agic/InvalidDataException;

    const-string v2, "Invalid bitrate in frame header"

    invoke-direct {v1, v2}, Lcom/mpatric/mp3agic/InvalidDataException;-><init>(Ljava/lang/String;)V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
    .end packed-switch
.end method

.method private setChannelMode(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const-string p1, "Mono"

    .line 252
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->channelMode:Ljava/lang/String;

    goto :goto_0

    .line 253
    :cond_0
    new-instance p1, Lcom/mpatric/mp3agic/InvalidDataException;

    const-string v0, "Invalid channel mode in frame header"

    invoke-direct {p1, v0}, Lcom/mpatric/mp3agic/InvalidDataException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const-string p1, "Dual mono"

    .line 251
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->channelMode:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const-string p1, "Joint stereo"

    .line 250
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->channelMode:Ljava/lang/String;

    goto :goto_0

    :cond_3
    const-string p1, "Stereo"

    .line 249
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->channelMode:Ljava/lang/String;

    :goto_0
    return-void
.end method

.method private setCopyright(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 281
    :goto_0
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->copyright:Z

    return-void
.end method

.method private setEmphasis(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const-string p1, "CCITT J.17"

    .line 292
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->emphasis:Ljava/lang/String;

    goto :goto_0

    .line 293
    :cond_0
    new-instance p1, Lcom/mpatric/mp3agic/InvalidDataException;

    const-string v0, "Invalid emphasis in frame header"

    invoke-direct {p1, v0}, Lcom/mpatric/mp3agic/InvalidDataException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const-string p1, "50/15 ms"

    .line 291
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->emphasis:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const-string p1, "None"

    .line 290
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->emphasis:Ljava/lang/String;

    :goto_0
    return-void
.end method

.method private setFields(J)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    const-wide v0, 0xffe00000L

    .line 73
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/mpatric/mp3agic/MpegFrame;->extractField(JJ)I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x7ff

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const-wide/32 v0, 0x180000

    .line 75
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/mpatric/mp3agic/MpegFrame;->extractField(JJ)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/MpegFrame;->setVersion(I)V

    const-wide/32 v0, 0x60000

    .line 76
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/mpatric/mp3agic/MpegFrame;->extractField(JJ)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/MpegFrame;->setLayer(I)V

    const-wide/32 v0, 0x10000

    .line 77
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/mpatric/mp3agic/MpegFrame;->extractField(JJ)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/MpegFrame;->setProtection(I)V

    const-wide/32 v0, 0xf000

    .line 78
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/mpatric/mp3agic/MpegFrame;->extractField(JJ)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/MpegFrame;->setBitRate(I)V

    const-wide/16 v0, 0xc00

    .line 79
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/mpatric/mp3agic/MpegFrame;->extractField(JJ)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/MpegFrame;->setSampleRate(I)V

    const-wide/16 v0, 0x200

    .line 80
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/mpatric/mp3agic/MpegFrame;->extractField(JJ)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/MpegFrame;->setPadding(I)V

    const-wide/16 v0, 0x100

    .line 81
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/mpatric/mp3agic/MpegFrame;->extractField(JJ)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/MpegFrame;->setPrivate(I)V

    const-wide/16 v0, 0xc0

    .line 82
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/mpatric/mp3agic/MpegFrame;->extractField(JJ)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/MpegFrame;->setChannelMode(I)V

    const-wide/16 v0, 0x30

    .line 83
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/mpatric/mp3agic/MpegFrame;->extractField(JJ)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/MpegFrame;->setModeExtension(I)V

    const-wide/16 v0, 0x8

    .line 84
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/mpatric/mp3agic/MpegFrame;->extractField(JJ)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/MpegFrame;->setCopyright(I)V

    const-wide/16 v0, 0x4

    .line 85
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/mpatric/mp3agic/MpegFrame;->extractField(JJ)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/mpatric/mp3agic/MpegFrame;->setOriginal(I)V

    const-wide/16 v0, 0x3

    .line 86
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/mpatric/mp3agic/MpegFrame;->extractField(JJ)I

    move-result p1

    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/MpegFrame;->setEmphasis(I)V

    return-void

    .line 74
    :cond_0
    new-instance p1, Lcom/mpatric/mp3agic/InvalidDataException;

    const-string p2, "Frame sync missing"

    invoke-direct {p1, p2}, Lcom/mpatric/mp3agic/InvalidDataException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private setLayer(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    const/4 v0, 0x3

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v2, 0x2

    if-eq p1, v2, :cond_1

    if-ne p1, v0, :cond_0

    .line 113
    iput v1, p0, Lcom/mpatric/mp3agic/MpegFrame;->layer:I

    goto :goto_0

    .line 114
    :cond_0
    new-instance p1, Lcom/mpatric/mp3agic/InvalidDataException;

    const-string v0, "Invalid mpeg layer description in frame header"

    invoke-direct {p1, v0}, Lcom/mpatric/mp3agic/InvalidDataException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 112
    :cond_1
    iput v2, p0, Lcom/mpatric/mp3agic/MpegFrame;->layer:I

    goto :goto_0

    .line 111
    :cond_2
    iput v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->layer:I

    :goto_0
    return-void
.end method

.method private setModeExtension(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 258
    iget-object v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->channelMode:Ljava/lang/String;

    const-string v1, "Joint stereo"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "n/a"

    .line 259
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->modeExtension:Ljava/lang/String;

    return-void

    .line 261
    :cond_0
    iget v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->layer:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v3, :cond_5

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    if-ne v0, v1, :cond_6

    if-eqz p1, :cond_4

    if-eq p1, v3, :cond_3

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_6

    const-string p1, "Intensity & M/S stereo"

    .line 273
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->modeExtension:Ljava/lang/String;

    return-void

    :cond_2
    const-string p1, "M/S stereo"

    .line 272
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->modeExtension:Ljava/lang/String;

    return-void

    :cond_3
    const-string p1, "Intensity stereo"

    .line 271
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->modeExtension:Ljava/lang/String;

    return-void

    :cond_4
    const-string p1, "None"

    .line 270
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->modeExtension:Ljava/lang/String;

    return-void

    :cond_5
    :goto_0
    if-eqz p1, :cond_9

    if-eq p1, v3, :cond_8

    if-eq p1, v2, :cond_7

    if-ne p1, v1, :cond_6

    const-string p1, "Bands 16-31"

    .line 266
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->modeExtension:Ljava/lang/String;

    return-void

    .line 276
    :cond_6
    new-instance p1, Lcom/mpatric/mp3agic/InvalidDataException;

    const-string v0, "Invalid mode extension in frame header"

    invoke-direct {p1, v0}, Lcom/mpatric/mp3agic/InvalidDataException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    const-string p1, "Bands 12-31"

    .line 265
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->modeExtension:Ljava/lang/String;

    return-void

    :cond_8
    const-string p1, "Bands 8-31"

    .line 264
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->modeExtension:Ljava/lang/String;

    return-void

    :cond_9
    const-string p1, "Bands 4-31"

    .line 263
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->modeExtension:Ljava/lang/String;

    return-void
.end method

.method private setOriginal(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 285
    :goto_0
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->original:Z

    return-void
.end method

.method private setPadding(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 240
    :goto_0
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->padding:Z

    return-void
.end method

.method private setPrivate(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 244
    :goto_0
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->privat:Z

    return-void
.end method

.method private setProtection(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 119
    :goto_0
    iput-boolean v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->protection:Z

    return-void
.end method

.method private setSampleRate(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 217
    iget-object v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->version:Ljava/lang/String;

    const-string v1, "1.0"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    if-eq p1, v2, :cond_0

    if-ne p1, v1, :cond_8

    const/16 p1, 0x7d00

    .line 221
    iput p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->sampleRate:I

    return-void

    :cond_0
    const p1, 0xbb80

    .line 220
    iput p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->sampleRate:I

    return-void

    :cond_1
    const p1, 0xac44

    .line 219
    iput p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->sampleRate:I

    return-void

    .line 223
    :cond_2
    iget-object v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->version:Ljava/lang/String;

    const-string v3, "2.0"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz p1, :cond_4

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_8

    const/16 p1, 0x3e80

    .line 227
    iput p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->sampleRate:I

    return-void

    :cond_3
    const/16 p1, 0x5dc0

    .line 226
    iput p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->sampleRate:I

    return-void

    :cond_4
    const/16 p1, 0x5622

    .line 225
    iput p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->sampleRate:I

    return-void

    .line 229
    :cond_5
    iget-object v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->version:Ljava/lang/String;

    const-string v3, "2.5"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    if-eqz p1, :cond_7

    if-eq p1, v2, :cond_6

    if-ne p1, v1, :cond_8

    const/16 p1, 0x1f40

    .line 233
    iput p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->sampleRate:I

    return-void

    :cond_6
    const/16 p1, 0x2ee0

    .line 232
    iput p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->sampleRate:I

    return-void

    :cond_7
    const/16 p1, 0x2b11

    .line 231
    iput p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->sampleRate:I

    return-void

    .line 236
    :cond_8
    new-instance p1, Lcom/mpatric/mp3agic/InvalidDataException;

    const-string v0, "Invalid sample rate in frame header"

    invoke-direct {p1, v0}, Lcom/mpatric/mp3agic/InvalidDataException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private setVersion(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    if-eqz p1, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const-string p1, "1.0"

    .line 104
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->version:Ljava/lang/String;

    goto :goto_0

    .line 105
    :cond_0
    new-instance p1, Lcom/mpatric/mp3agic/InvalidDataException;

    const-string v0, "Invalid mpeg audio version in frame header"

    invoke-direct {p1, v0}, Lcom/mpatric/mp3agic/InvalidDataException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const-string p1, "2.0"

    .line 103
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->version:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const-string p1, "2.5"

    .line 102
    iput-object p1, p0, Lcom/mpatric/mp3agic/MpegFrame;->version:Ljava/lang/String;

    :goto_0
    return-void
.end method


# virtual methods
.method protected extractField(JJ)I
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x1f

    if-gt v1, v2, :cond_1

    shr-long v2, p3, v1

    const-wide/16 v4, 0x1

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    move v0, v1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    shr-long/2addr p1, v0

    shr-long/2addr p3, v0

    and-long/2addr p1, p3

    long-to-int p2, p1

    return p2
.end method

.method public getBitrate()I
    .locals 1

    .line 298
    iget v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    return v0
.end method

.method public getChannelMode()Ljava/lang/String;
    .locals 1

    .line 302
    iget-object v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->channelMode:Ljava/lang/String;

    return-object v0
.end method

.method public getEmphasis()Ljava/lang/String;
    .locals 1

    .line 310
    iget-object v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->emphasis:Ljava/lang/String;

    return-object v0
.end method

.method public getLayer()Ljava/lang/String;
    .locals 2

    .line 314
    sget-object v0, Lcom/mpatric/mp3agic/MpegFrame;->MPEG_LAYERS:[Ljava/lang/String;

    iget v1, p0, Lcom/mpatric/mp3agic/MpegFrame;->layer:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getLengthInBytes()I
    .locals 3

    .line 348
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->padding:Z

    .line 350
    iget v1, p0, Lcom/mpatric/mp3agic/MpegFrame;->layer:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const v1, 0xbb80

    .line 351
    iget v2, p0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    mul-int v2, v2, v1

    iget v1, p0, Lcom/mpatric/mp3agic/MpegFrame;->sampleRate:I

    div-int/2addr v2, v1

    mul-int/lit8 v0, v0, 0x4

    goto :goto_0

    :cond_0
    const v1, 0x23280

    .line 353
    iget v2, p0, Lcom/mpatric/mp3agic/MpegFrame;->bitrate:I

    mul-int v2, v2, v1

    iget v1, p0, Lcom/mpatric/mp3agic/MpegFrame;->sampleRate:I

    div-int/2addr v2, v1

    :goto_0
    add-int/2addr v2, v0

    int-to-long v0, v2

    long-to-int v1, v0

    return v1
.end method

.method public getModeExtension()Ljava/lang/String;
    .locals 1

    .line 318
    iget-object v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->modeExtension:Ljava/lang/String;

    return-object v0
.end method

.method public getSampleRate()I
    .locals 1

    .line 338
    iget v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->sampleRate:I

    return v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 342
    iget-object v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->version:Ljava/lang/String;

    return-object v0
.end method

.method public hasPadding()Z
    .locals 1

    .line 326
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->padding:Z

    return v0
.end method

.method public isCopyright()Z
    .locals 1

    .line 306
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->copyright:Z

    return v0
.end method

.method public isOriginal()Z
    .locals 1

    .line 322
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->original:Z

    return v0
.end method

.method public isPrivate()Z
    .locals 1

    .line 330
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->privat:Z

    return v0
.end method

.method public isProtection()Z
    .locals 1

    .line 334
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/MpegFrame;->protection:Z

    return v0
.end method
