.class final Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;
.super Ljava/lang/Object;
.source "TtmlStyle.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/text/ttml/TtmlStyle$FontSizeUnit;,
        Lcom/google/android/exoplayer2/text/ttml/TtmlStyle$StyleFlags;
    }
.end annotation


# static fields
.field public static final FONT_SIZE_UNIT_EM:I = 0x2

.field public static final FONT_SIZE_UNIT_PERCENT:I = 0x3

.field public static final FONT_SIZE_UNIT_PIXEL:I = 0x1

.field private static final OFF:I = 0x0

.field private static final ON:I = 0x1

.field public static final STYLE_BOLD:I = 0x1

.field public static final STYLE_BOLD_ITALIC:I = 0x3

.field public static final STYLE_ITALIC:I = 0x2

.field public static final STYLE_NORMAL:I = 0x0

.field public static final UNSPECIFIED:I = -0x1


# instance fields
.field private backgroundColor:I

.field private bold:I

.field private fontColor:I

.field private fontFamily:Ljava/lang/String;

.field private fontSize:F

.field private fontSizeUnit:I

.field private hasBackgroundColor:Z

.field private hasFontColor:Z

.field private id:Ljava/lang/String;

.field private inheritableStyle:Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;

.field private italic:I

.field private linethrough:I

.field private textAlign:Landroid/text/Layout$Alignment;

.field private underline:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 70
    iput v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->linethrough:I

    .line 71
    iput v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->underline:I

    .line 72
    iput v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->bold:I

    .line 73
    iput v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->italic:I

    .line 74
    iput v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->fontSizeUnit:I

    return-void
.end method

.method private inherit(Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;Z)Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;
    .locals 2

    if-eqz p1, :cond_8

    .line 191
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->hasFontColor:Z

    if-nez v0, :cond_0

    iget-boolean v0, p1, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->hasFontColor:Z

    if-eqz v0, :cond_0

    .line 192
    iget v0, p1, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->fontColor:I

    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->setFontColor(I)Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;

    .line 194
    :cond_0
    iget v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->bold:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 195
    iget v0, p1, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->bold:I

    iput v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->bold:I

    .line 197
    :cond_1
    iget v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->italic:I

    if-ne v0, v1, :cond_2

    .line 198
    iget v0, p1, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->italic:I

    iput v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->italic:I

    .line 200
    :cond_2
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->fontFamily:Ljava/lang/String;

    if-nez v0, :cond_3

    .line 201
    iget-object v0, p1, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->fontFamily:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->fontFamily:Ljava/lang/String;

    .line 203
    :cond_3
    iget v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->linethrough:I

    if-ne v0, v1, :cond_4

    .line 204
    iget v0, p1, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->linethrough:I

    iput v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->linethrough:I

    .line 206
    :cond_4
    iget v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->underline:I

    if-ne v0, v1, :cond_5

    .line 207
    iget v0, p1, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->underline:I

    iput v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->underline:I

    .line 209
    :cond_5
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->textAlign:Landroid/text/Layout$Alignment;

    if-nez v0, :cond_6

    .line 210
    iget-object v0, p1, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->textAlign:Landroid/text/Layout$Alignment;

    iput-object v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->textAlign:Landroid/text/Layout$Alignment;

    .line 212
    :cond_6
    iget v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->fontSizeUnit:I

    if-ne v0, v1, :cond_7

    .line 213
    iget v0, p1, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->fontSizeUnit:I

    iput v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->fontSizeUnit:I

    .line 214
    iget v0, p1, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->fontSize:F

    iput v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->fontSize:F

    :cond_7
    if-eqz p2, :cond_8

    .line 217
    iget-boolean p2, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->hasBackgroundColor:Z

    if-nez p2, :cond_8

    iget-boolean p2, p1, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->hasBackgroundColor:Z

    if-eqz p2, :cond_8

    .line 218
    iget p1, p1, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->backgroundColor:I

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->setBackgroundColor(I)Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;

    :cond_8
    return-object p0
.end method


# virtual methods
.method public chain(Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;)Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;
    .locals 1

    const/4 v0, 0x1

    .line 186
    invoke-direct {p0, p1, v0}, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->inherit(Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;Z)Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;

    move-result-object p1

    return-object p1
.end method

.method public getBackgroundColor()I
    .locals 2

    .line 152
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->hasBackgroundColor:Z

    if-eqz v0, :cond_0

    .line 155
    iget v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->backgroundColor:I

    return v0

    .line 153
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Background color has not been defined."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getFontColor()I
    .locals 2

    .line 134
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->hasFontColor:Z

    if-eqz v0, :cond_0

    .line 137
    iget v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->fontColor:I

    return v0

    .line 135
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Font color has not been defined."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getFontFamily()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->fontFamily:Ljava/lang/String;

    return-object v0
.end method

.method public getFontSize()F
    .locals 1

    .line 257
    iget v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->fontSize:F

    return v0
.end method

.method public getFontSizeUnit()I
    .locals 1

    .line 253
    iget v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->fontSizeUnit:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 230
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getStyle()I
    .locals 4

    .line 84
    iget v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->bold:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->italic:I

    if-ne v0, v1, :cond_0

    return v1

    .line 87
    :cond_0
    iget v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->bold:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v3, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->italic:I

    if-ne v3, v2, :cond_2

    const/4 v1, 0x2

    :cond_2
    or-int/2addr v0, v1

    return v0
.end method

.method public getTextAlign()Landroid/text/Layout$Alignment;
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->textAlign:Landroid/text/Layout$Alignment;

    return-object v0
.end method

.method public hasBackgroundColor()Z
    .locals 1

    .line 165
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->hasBackgroundColor:Z

    return v0
.end method

.method public hasFontColor()Z
    .locals 1

    .line 148
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->hasFontColor:Z

    return v0
.end method

.method public inherit(Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;)Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;
    .locals 1

    const/4 v0, 0x0

    .line 176
    invoke-direct {p0, p1, v0}, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->inherit(Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;Z)Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;

    move-result-object p1

    return-object p1
.end method

.method public isLinethrough()Z
    .locals 2

    .line 92
    iget v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->linethrough:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public isUnderline()Z
    .locals 2

    .line 102
    iget v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->underline:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public setBackgroundColor(I)Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;
    .locals 0

    .line 159
    iput p1, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->backgroundColor:I

    const/4 p1, 0x1

    .line 160
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->hasBackgroundColor:Z

    return-object p0
.end method

.method public setBold(Z)Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->inheritableStyle:Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkState(Z)V

    .line 113
    iput p1, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->bold:I

    return-object p0
.end method

.method public setFontColor(I)Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;
    .locals 2

    .line 141
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->inheritableStyle:Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkState(Z)V

    .line 142
    iput p1, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->fontColor:I

    .line 143
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->hasFontColor:Z

    return-object p0
.end method

.method public setFontFamily(Ljava/lang/String;)Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->inheritableStyle:Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkState(Z)V

    .line 129
    iput-object p1, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->fontFamily:Ljava/lang/String;

    return-object p0
.end method

.method public setFontSize(F)Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;
    .locals 0

    .line 243
    iput p1, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->fontSize:F

    return-object p0
.end method

.method public setFontSizeUnit(I)Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;
    .locals 0

    .line 248
    iput p1, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->fontSizeUnit:I

    return-object p0
.end method

.method public setId(Ljava/lang/String;)Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;
    .locals 0

    .line 225
    iput-object p1, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->id:Ljava/lang/String;

    return-object p0
.end method

.method public setItalic(Z)Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->inheritableStyle:Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkState(Z)V

    .line 119
    iput p1, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->italic:I

    return-object p0
.end method

.method public setLinethrough(Z)Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->inheritableStyle:Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkState(Z)V

    .line 97
    iput p1, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->linethrough:I

    return-object p0
.end method

.method public setTextAlign(Landroid/text/Layout$Alignment;)Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;
    .locals 0

    .line 238
    iput-object p1, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->textAlign:Landroid/text/Layout$Alignment;

    return-object p0
.end method

.method public setUnderline(Z)Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->inheritableStyle:Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkState(Z)V

    .line 107
    iput p1, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlStyle;->underline:I

    return-object p0
.end method
