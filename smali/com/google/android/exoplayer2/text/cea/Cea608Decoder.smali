.class public final Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;
.super Lcom/google/android/exoplayer2/text/cea/CeaDecoder;
.source "Cea608Decoder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;
    }
.end annotation


# static fields
.field private static final BASIC_CHARACTER_SET:[I

.field private static final CC_FIELD_FLAG:I = 0x1

.field private static final CC_IMPLICIT_DATA_HEADER:B = -0x4t

.field private static final CC_MODE_PAINT_ON:I = 0x3

.field private static final CC_MODE_POP_ON:I = 0x2

.field private static final CC_MODE_ROLL_UP:I = 0x1

.field private static final CC_MODE_UNKNOWN:I = 0x0

.field private static final CC_TYPE_FLAG:I = 0x2

.field private static final CC_VALID_608_ID:I = 0x4

.field private static final CC_VALID_FLAG:I = 0x4

.field private static final COLORS:[I

.field private static final COLUMN_INDICES:[I

.field private static final CTRL_BACKSPACE:B = 0x21t

.field private static final CTRL_CARRIAGE_RETURN:B = 0x2dt

.field private static final CTRL_DELETE_TO_END_OF_ROW:B = 0x24t

.field private static final CTRL_END_OF_CAPTION:B = 0x2ft

.field private static final CTRL_ERASE_DISPLAYED_MEMORY:B = 0x2ct

.field private static final CTRL_ERASE_NON_DISPLAYED_MEMORY:B = 0x2et

.field private static final CTRL_RESUME_CAPTION_LOADING:B = 0x20t

.field private static final CTRL_RESUME_DIRECT_CAPTIONING:B = 0x29t

.field private static final CTRL_ROLL_UP_CAPTIONS_2_ROWS:B = 0x25t

.field private static final CTRL_ROLL_UP_CAPTIONS_3_ROWS:B = 0x26t

.field private static final CTRL_ROLL_UP_CAPTIONS_4_ROWS:B = 0x27t

.field private static final DEFAULT_CAPTIONS_ROW_COUNT:I = 0x4

.field private static final NTSC_CC_FIELD_1:I = 0x0

.field private static final NTSC_CC_FIELD_2:I = 0x1

.field private static final ROW_INDICES:[I

.field private static final SPECIAL_CHARACTER_SET:[I

.field private static final SPECIAL_ES_FR_CHARACTER_SET:[I

.field private static final SPECIAL_PT_DE_CHARACTER_SET:[I


# instance fields
.field private captionMode:I

.field private captionRowCount:I

.field private final ccData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

.field private final cueBuilders:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;",
            ">;"
        }
    .end annotation
.end field

.field private cues:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/text/Cue;",
            ">;"
        }
    .end annotation
.end field

.field private currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

.field private lastCues:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/text/Cue;",
            ">;"
        }
    .end annotation
.end field

.field private final packetLength:I

.field private repeatableControlCc1:B

.field private repeatableControlCc2:B

.field private repeatableControlSet:Z

.field private final selectedField:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x8

    new-array v1, v0, [I

    .line 56
    fill-array-data v1, :array_0

    sput-object v1, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->ROW_INDICES:[I

    new-array v0, v0, [I

    .line 57
    fill-array-data v0, :array_1

    sput-object v0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->COLUMN_INDICES:[I

    const/4 v0, 0x7

    new-array v0, v0, [I

    .line 58
    fill-array-data v0, :array_2

    sput-object v0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->COLORS:[I

    const/16 v0, 0x60

    new-array v0, v0, [I

    .line 117
    fill-array-data v0, :array_3

    sput-object v0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->BASIC_CHARACTER_SET:[I

    const/16 v0, 0x10

    new-array v0, v0, [I

    .line 145
    fill-array-data v0, :array_4

    sput-object v0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->SPECIAL_CHARACTER_SET:[I

    const/16 v0, 0x20

    new-array v1, v0, [I

    .line 165
    fill-array-data v1, :array_5

    sput-object v1, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->SPECIAL_ES_FR_CHARACTER_SET:[I

    new-array v0, v0, [I

    .line 175
    fill-array-data v0, :array_6

    sput-object v0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->SPECIAL_PT_DE_CHARACTER_SET:[I

    return-void

    nop

    :array_0
    .array-data 4
        0xb
        0x1
        0x3
        0xc
        0xe
        0x5
        0x7
        0x9
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x4
        0x8
        0xc
        0x10
        0x14
        0x18
        0x1c
    .end array-data

    :array_2
    .array-data 4
        -0x1
        -0xff0100
        -0xffff01
        -0xff0001
        -0x10000
        -0x100
        -0xff01
    .end array-data

    :array_3
    .array-data 4
        0x20
        0x21
        0x22
        0x23
        0x24
        0x25
        0x26
        0x27
        0x28
        0x29
        0xe1
        0x2b
        0x2c
        0x2d
        0x2e
        0x2f
        0x30
        0x31
        0x32
        0x33
        0x34
        0x35
        0x36
        0x37
        0x38
        0x39
        0x3a
        0x3b
        0x3c
        0x3d
        0x3e
        0x3f
        0x40
        0x41
        0x42
        0x43
        0x44
        0x45
        0x46
        0x47
        0x48
        0x49
        0x4a
        0x4b
        0x4c
        0x4d
        0x4e
        0x4f
        0x50
        0x51
        0x52
        0x53
        0x54
        0x55
        0x56
        0x57
        0x58
        0x59
        0x5a
        0x5b
        0xe9
        0x5d
        0xed
        0xf3
        0xfa
        0x61
        0x62
        0x63
        0x64
        0x65
        0x66
        0x67
        0x68
        0x69
        0x6a
        0x6b
        0x6c
        0x6d
        0x6e
        0x6f
        0x70
        0x71
        0x72
        0x73
        0x74
        0x75
        0x76
        0x77
        0x78
        0x79
        0x7a
        0xe7
        0xf7
        0xd1
        0xf1
        0x25a0
    .end array-data

    :array_4
    .array-data 4
        0xae
        0xb0
        0xbd
        0xbf
        0x2122
        0xa2
        0xa3
        0x266a
        0xe0
        0x20
        0xe8
        0xe2
        0xea
        0xee
        0xf4
        0xfb
    .end array-data

    :array_5
    .array-data 4
        0xc1
        0xc9
        0xd3
        0xda
        0xdc
        0xfc
        0x2018
        0xa1
        0x2a
        0x27
        0x2014
        0xa9
        0x2120
        0x2022
        0x201c
        0x201d
        0xc0
        0xc2
        0xc7
        0xc8
        0xca
        0xcb
        0xeb
        0xce
        0xcf
        0xef
        0xd4
        0xd9
        0xf9
        0xdb
        0xab
        0xbb
    .end array-data

    :array_6
    .array-data 4
        0xc3
        0xe3
        0xcd
        0xcc
        0xec
        0xd2
        0xf2
        0xd5
        0xf5
        0x7b
        0x7d
        0x5c
        0x5e
        0x5f
        0x7c
        0x7e
        0xc4
        0xe4
        0xd6
        0xf6
        0xdf
        0xa5
        0xa4
        0x2502
        0xc5
        0xe5
        0xd8
        0xf8
        0x250c
        0x2510
        0x2514
        0x2518
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 4

    .line 200
    invoke-direct {p0}, Lcom/google/android/exoplayer2/text/cea/CeaDecoder;-><init>()V

    .line 201
    new-instance v0, Lcom/google/android/exoplayer2/util/ParsableByteArray;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/util/ParsableByteArray;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->ccData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    .line 202
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->cueBuilders:Ljava/util/ArrayList;

    .line 203
    new-instance v0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;-><init>(II)V

    iput-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    const-string v0, "application/x-mp4-cea-608"

    .line 204
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    const/4 v3, 0x3

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    :goto_0
    iput p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->packetLength:I

    if-eq p2, v3, :cond_1

    if-eq p2, v1, :cond_1

    const/4 p1, 0x1

    .line 214
    iput p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->selectedField:I

    goto :goto_1

    .line 208
    :cond_1
    iput v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->selectedField:I

    .line 217
    :goto_1
    invoke-direct {p0, v2}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->setCaptionMode(I)V

    .line 218
    invoke-direct {p0}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->resetCueBuilders()V

    return-void
.end method

.method private static getChar(B)C
    .locals 1

    and-int/lit8 p0, p0, 0x7f

    add-int/lit8 p0, p0, -0x20

    .line 539
    sget-object v0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->BASIC_CHARACTER_SET:[I

    aget p0, v0, p0

    int-to-char p0, p0

    return p0
.end method

.method private getDisplayCues()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/text/Cue;",
            ">;"
        }
    .end annotation

    .line 499
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 500
    :goto_0
    iget-object v2, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->cueBuilders:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 501
    iget-object v2, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->cueBuilders:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    invoke-virtual {v2}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->build()Lcom/google/android/exoplayer2/text/Cue;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 503
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static getExtendedEsFrChar(B)C
    .locals 1

    and-int/lit8 p0, p0, 0x1f

    .line 549
    sget-object v0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->SPECIAL_ES_FR_CHARACTER_SET:[I

    aget p0, v0, p0

    int-to-char p0, p0

    return p0
.end method

.method private static getExtendedPtDeChar(B)C
    .locals 1

    and-int/lit8 p0, p0, 0x1f

    .line 554
    sget-object v0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->SPECIAL_PT_DE_CHARACTER_SET:[I

    aget p0, v0, p0

    int-to-char p0, p0

    return p0
.end method

.method private static getSpecialChar(B)C
    .locals 1

    and-int/lit8 p0, p0, 0xf

    .line 544
    sget-object v0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->SPECIAL_CHARACTER_SET:[I

    aget p0, v0, p0

    int-to-char p0, p0

    return p0
.end method

.method private handleCtrl(BB)Z
    .locals 3

    .line 339
    invoke-static {p1}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->isRepeatable(B)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 345
    iget-boolean v1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->repeatableControlSet:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget-byte v1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->repeatableControlCc1:B

    if-ne v1, p1, :cond_0

    iget-byte v1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->repeatableControlCc2:B

    if-ne v1, p2, :cond_0

    const/4 p1, 0x0

    .line 349
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->repeatableControlSet:Z

    return v2

    .line 355
    :cond_0
    iput-boolean v2, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->repeatableControlSet:Z

    .line 356
    iput-byte p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->repeatableControlCc1:B

    .line 357
    iput-byte p2, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->repeatableControlCc2:B

    .line 361
    :cond_1
    invoke-static {p1, p2}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->isMidrowCtrlCode(BB)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 362
    invoke-direct {p0, p2}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->handleMidrowCtrl(B)V

    goto :goto_0

    .line 363
    :cond_2
    invoke-static {p1, p2}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->isPreambleAddressCode(BB)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 364
    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->handlePreambleAddressCode(BB)V

    goto :goto_0

    .line 365
    :cond_3
    invoke-static {p1, p2}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->isTabCtrlCode(BB)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 366
    iget-object p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    add-int/lit8 p2, p2, -0x20

    invoke-virtual {p1, p2}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->setTab(I)V

    goto :goto_0

    .line 367
    :cond_4
    invoke-static {p1, p2}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->isMiscCode(BB)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 368
    invoke-direct {p0, p2}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->handleMiscCode(B)V

    :cond_5
    :goto_0
    return v0
.end method

.method private handleMidrowCtrl(B)V
    .locals 4

    .line 378
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->append(C)V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 383
    :goto_0
    iget-object v2, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    invoke-virtual {v2, v0}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->setUnderline(Z)V

    shr-int/2addr p1, v1

    and-int/lit8 p1, p1, 0xf

    const/4 v0, 0x7

    if-ne p1, v0, :cond_1

    .line 387
    iget-object p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    new-instance v0, Landroid/text/style/StyleSpan;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {p1, v0, v2}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->setMidrowStyle(Landroid/text/style/CharacterStyle;I)V

    .line 388
    iget-object p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    const/4 v2, -0x1

    invoke-direct {v0, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->setMidrowStyle(Landroid/text/style/CharacterStyle;I)V

    goto :goto_1

    .line 390
    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    sget-object v3, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->COLORS:[I

    aget p1, v3, p1

    invoke-direct {v2, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v0, v2, v1}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->setMidrowStyle(Landroid/text/style/CharacterStyle;I)V

    :goto_1
    return-void
.end method

.method private handleMiscCode(B)V
    .locals 4

    const/16 v0, 0x20

    const/4 v1, 0x2

    if-eq p1, v0, :cond_5

    const/16 v0, 0x29

    const/4 v2, 0x3

    if-eq p1, v0, :cond_4

    const/4 v0, 0x1

    packed-switch p1, :pswitch_data_0

    .line 461
    iget v1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->captionMode:I

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/16 v3, 0x21

    if-eq p1, v3, :cond_2

    packed-switch p1, :pswitch_data_1

    goto :goto_0

    .line 476
    :pswitch_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->getDisplayCues()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->cues:Ljava/util/List;

    .line 477
    invoke-direct {p0}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->resetCueBuilders()V

    goto :goto_0

    .line 473
    :pswitch_1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->resetCueBuilders()V

    goto :goto_0

    :pswitch_2
    if-ne v1, v0, :cond_3

    .line 482
    iget-object p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    .line 483
    iget-object p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->rollUp()V

    goto :goto_0

    :pswitch_3
    const/4 p1, 0x0

    .line 467
    iput-object p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->cues:Ljava/util/List;

    if-eq v1, v0, :cond_1

    if-ne v1, v2, :cond_3

    .line 469
    :cond_1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->resetCueBuilders()V

    goto :goto_0

    .line 487
    :cond_2
    iget-object p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->backspace()V

    :cond_3
    :goto_0
    return-void

    .line 447
    :pswitch_4
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->setCaptionMode(I)V

    const/4 p1, 0x4

    .line 448
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->setCaptionRowCount(I)V

    return-void

    .line 443
    :pswitch_5
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->setCaptionMode(I)V

    .line 444
    invoke-direct {p0, v2}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->setCaptionRowCount(I)V

    return-void

    .line 439
    :pswitch_6
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->setCaptionMode(I)V

    .line 440
    invoke-direct {p0, v1}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->setCaptionRowCount(I)V

    return-void

    .line 454
    :cond_4
    invoke-direct {p0, v2}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->setCaptionMode(I)V

    return-void

    .line 451
    :cond_5
    invoke-direct {p0, v1}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->setCaptionMode(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x25
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2c
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private handlePreambleAddressCode(BB)V
    .locals 5

    .line 397
    sget-object v0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->ROW_INDICES:[I

    const/4 v1, 0x7

    and-int/2addr p1, v1

    aget p1, v0, p1

    and-int/lit8 v0, p2, 0x20

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    add-int/lit8 p1, p1, 0x1

    .line 409
    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->getRow()I

    move-result v0

    if-eq p1, v0, :cond_3

    .line 410
    iget v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->captionMode:I

    if-eq v0, v2, :cond_2

    iget-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 411
    new-instance v0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    iget v3, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->captionMode:I

    iget v4, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->captionRowCount:I

    invoke-direct {v0, v3, v4}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;-><init>(II)V

    iput-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    .line 412
    iget-object v3, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->cueBuilders:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 414
    :cond_2
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->setRow(I)V

    :cond_3
    and-int/lit8 p1, p2, 0x1

    if-ne p1, v2, :cond_4

    .line 418
    iget-object p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    new-instance v0, Landroid/text/style/UnderlineSpan;

    invoke-direct {v0}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->setPreambleStyle(Landroid/text/style/CharacterStyle;)V

    :cond_4
    shr-int/lit8 p1, p2, 0x1

    and-int/lit8 p1, p1, 0xf

    if-gt p1, v1, :cond_6

    if-ne p1, v1, :cond_5

    .line 426
    iget-object p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    new-instance p2, Landroid/text/style/StyleSpan;

    const/4 v0, 0x2

    invoke-direct {p2, v0}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {p1, p2}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->setPreambleStyle(Landroid/text/style/CharacterStyle;)V

    .line 427
    iget-object p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    new-instance p2, Landroid/text/style/ForegroundColorSpan;

    const/4 v0, -0x1

    invoke-direct {p2, v0}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p1, p2}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->setPreambleStyle(Landroid/text/style/CharacterStyle;)V

    goto :goto_1

    .line 429
    :cond_5
    iget-object p2, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    sget-object v1, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->COLORS:[I

    aget p1, v1, p1

    invoke-direct {v0, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p2, v0}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->setPreambleStyle(Landroid/text/style/CharacterStyle;)V

    goto :goto_1

    .line 432
    :cond_6
    iget-object p2, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    sget-object v0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->COLUMN_INDICES:[I

    and-int/2addr p1, v1

    aget p1, v0, p1

    invoke-virtual {p2, p1}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->setIndent(I)V

    :goto_1
    return-void
.end method

.method private static isMidrowCtrlCode(BB)Z
    .locals 1

    and-int/lit16 p0, p0, 0xf7

    const/16 v0, 0x11

    if-ne p0, v0, :cond_0

    and-int/lit16 p0, p1, 0xf0

    const/16 p1, 0x20

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static isMiscCode(BB)Z
    .locals 1

    and-int/lit16 p0, p0, 0xf7

    const/16 v0, 0x14

    if-ne p0, v0, :cond_0

    and-int/lit16 p0, p1, 0xf0

    const/16 p1, 0x20

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static isPreambleAddressCode(BB)Z
    .locals 1

    and-int/lit16 p0, p0, 0xf0

    const/16 v0, 0x10

    if-ne p0, v0, :cond_0

    and-int/lit16 p0, p1, 0xc0

    const/16 p1, 0x40

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static isRepeatable(B)Z
    .locals 1

    and-int/lit16 p0, p0, 0xf0

    const/16 v0, 0x10

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static isTabCtrlCode(BB)Z
    .locals 1

    and-int/lit16 p0, p0, 0xf7

    const/16 v0, 0x17

    if-ne p0, v0, :cond_0

    const/16 p0, 0x21

    if-lt p1, p0, :cond_0

    const/16 p0, 0x23

    if-gt p1, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private resetCueBuilders()V
    .locals 2

    .line 532
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    iget v1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->captionMode:I

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->reset(I)V

    .line 533
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->cueBuilders:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 534
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->cueBuilders:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private setCaptionMode(I)V
    .locals 2

    .line 510
    iget v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->captionMode:I

    if-ne v0, p1, :cond_0

    return-void

    .line 515
    :cond_0
    iput p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->captionMode:I

    .line 518
    invoke-direct {p0}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->resetCueBuilders()V

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    if-nez p1, :cond_2

    :cond_1
    const/4 p1, 0x0

    .line 522
    iput-object p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->cues:Ljava/util/List;

    :cond_2
    return-void
.end method

.method private setCaptionRowCount(I)V
    .locals 1

    .line 527
    iput p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->captionRowCount:I

    .line 528
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->setCaptionRowCount(I)V

    return-void
.end method


# virtual methods
.method protected createSubtitle()Lcom/google/android/exoplayer2/text/Subtitle;
    .locals 2

    .line 251
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->cues:Ljava/util/List;

    iput-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->lastCues:Ljava/util/List;

    .line 252
    new-instance v1, Lcom/google/android/exoplayer2/text/cea/CeaSubtitle;

    invoke-direct {v1, v0}, Lcom/google/android/exoplayer2/text/cea/CeaSubtitle;-><init>(Ljava/util/List;)V

    return-object v1
.end method

.method protected decode(Lcom/google/android/exoplayer2/text/SubtitleInputBuffer;)V
    .locals 9

    .line 257
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->ccData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    iget-object v1, p1, Lcom/google/android/exoplayer2/text/SubtitleInputBuffer;->data:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    iget-object p1, p1, Lcom/google/android/exoplayer2/text/SubtitleInputBuffer;->data:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->reset([BI)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 260
    :cond_0
    :goto_0
    iget-object v3, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->ccData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    invoke-virtual {v3}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->bytesLeft()I

    move-result v3

    iget v4, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->packetLength:I

    if-lt v3, v4, :cond_b

    const/4 v3, 0x2

    if-ne v4, v3, :cond_1

    const/4 v4, -0x4

    goto :goto_1

    .line 261
    :cond_1
    iget-object v4, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->ccData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    .line 262
    invoke-virtual {v4}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedByte()I

    move-result v4

    int-to-byte v4, v4

    .line 263
    :goto_1
    iget-object v5, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->ccData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    invoke-virtual {v5}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedByte()I

    move-result v5

    and-int/lit8 v5, v5, 0x7f

    int-to-byte v5, v5

    .line 264
    iget-object v6, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->ccData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    invoke-virtual {v6}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedByte()I

    move-result v6

    and-int/lit8 v6, v6, 0x7f

    int-to-byte v6, v6

    and-int/lit8 v7, v4, 0x6

    const/4 v8, 0x4

    if-eq v7, v8, :cond_2

    goto :goto_0

    .line 275
    :cond_2
    iget v7, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->selectedField:I

    if-ne v7, v0, :cond_3

    and-int/lit8 v7, v4, 0x1

    if-nez v7, :cond_0

    :cond_3
    iget v7, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->selectedField:I

    if-ne v7, v3, :cond_4

    and-int/lit8 v3, v4, 0x1

    if-eq v3, v0, :cond_4

    goto :goto_0

    :cond_4
    if-nez v5, :cond_5

    if-nez v6, :cond_5

    goto :goto_0

    :cond_5
    and-int/lit16 v1, v5, 0xf7

    const/16 v3, 0x11

    if-ne v1, v3, :cond_6

    and-int/lit16 v1, v6, 0xf0

    const/16 v3, 0x30

    if-ne v1, v3, :cond_6

    .line 293
    iget-object v1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    invoke-static {v6}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->getSpecialChar(B)C

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->append(C)V

    goto :goto_2

    :cond_6
    and-int/lit16 v1, v5, 0xf6

    const/16 v3, 0x12

    if-ne v1, v3, :cond_8

    and-int/lit16 v1, v6, 0xe0

    const/16 v3, 0x20

    if-ne v1, v3, :cond_8

    .line 303
    iget-object v1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->backspace()V

    and-int/lit8 v1, v5, 0x1

    if-nez v1, :cond_7

    .line 306
    iget-object v1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    invoke-static {v6}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->getExtendedEsFrChar(B)C

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->append(C)V

    goto :goto_2

    .line 309
    :cond_7
    iget-object v1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    invoke-static {v6}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->getExtendedPtDeChar(B)C

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->append(C)V

    goto :goto_2

    :cond_8
    and-int/lit16 v1, v5, 0xe0

    if-nez v1, :cond_9

    .line 317
    invoke-direct {p0, v5, v6}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->handleCtrl(BB)Z

    move-result v2

    goto :goto_2

    .line 322
    :cond_9
    iget-object v1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    invoke-static {v5}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->getChar(B)C

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->append(C)V

    and-int/lit16 v1, v6, 0xe0

    if-eqz v1, :cond_a

    .line 324
    iget-object v1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->currentCueBuilder:Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;

    invoke-static {v6}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->getChar(B)C

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder$CueBuilder;->append(C)V

    :cond_a
    :goto_2
    const/4 v1, 0x1

    goto/16 :goto_0

    :cond_b
    if-eqz v1, :cond_e

    if-nez v2, :cond_c

    .line 330
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->repeatableControlSet:Z

    .line 332
    :cond_c
    iget p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->captionMode:I

    if-eq p1, v0, :cond_d

    const/4 v0, 0x3

    if-ne p1, v0, :cond_e

    .line 333
    :cond_d
    invoke-direct {p0}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->getDisplayCues()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->cues:Ljava/util/List;

    :cond_e
    return-void
.end method

.method public bridge synthetic dequeueInputBuffer()Lcom/google/android/exoplayer2/text/SubtitleInputBuffer;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/text/SubtitleDecoderException;
        }
    .end annotation

    .line 41
    invoke-super {p0}, Lcom/google/android/exoplayer2/text/cea/CeaDecoder;->dequeueInputBuffer()Lcom/google/android/exoplayer2/text/SubtitleInputBuffer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic dequeueOutputBuffer()Lcom/google/android/exoplayer2/text/SubtitleOutputBuffer;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/text/SubtitleDecoderException;
        }
    .end annotation

    .line 41
    invoke-super {p0}, Lcom/google/android/exoplayer2/text/cea/CeaDecoder;->dequeueOutputBuffer()Lcom/google/android/exoplayer2/text/SubtitleOutputBuffer;

    move-result-object v0

    return-object v0
.end method

.method public flush()V
    .locals 2

    .line 228
    invoke-super {p0}, Lcom/google/android/exoplayer2/text/cea/CeaDecoder;->flush()V

    const/4 v0, 0x0

    .line 229
    iput-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->cues:Ljava/util/List;

    .line 230
    iput-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->lastCues:Ljava/util/List;

    const/4 v0, 0x0

    .line 231
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->setCaptionMode(I)V

    const/4 v1, 0x4

    .line 232
    invoke-direct {p0, v1}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->setCaptionRowCount(I)V

    .line 233
    invoke-direct {p0}, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->resetCueBuilders()V

    .line 234
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->repeatableControlSet:Z

    .line 235
    iput-byte v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->repeatableControlCc1:B

    .line 236
    iput-byte v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->repeatableControlCc2:B

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "Cea608Decoder"

    return-object v0
.end method

.method protected isNewSubtitleDataAvailable()Z
    .locals 2

    .line 246
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->cues:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/exoplayer2/text/cea/Cea608Decoder;->lastCues:Ljava/util/List;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic queueInputBuffer(Lcom/google/android/exoplayer2/text/SubtitleInputBuffer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/text/SubtitleDecoderException;
        }
    .end annotation

    .line 41
    invoke-super {p0, p1}, Lcom/google/android/exoplayer2/text/cea/CeaDecoder;->queueInputBuffer(Lcom/google/android/exoplayer2/text/SubtitleInputBuffer;)V

    return-void
.end method

.method public release()V
    .locals 0

    return-void
.end method

.method public bridge synthetic setPositionUs(J)V
    .locals 0

    .line 41
    invoke-super {p0, p1, p2}, Lcom/google/android/exoplayer2/text/cea/CeaDecoder;->setPositionUs(J)V

    return-void
.end method
