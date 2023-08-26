.class Lcom/daaw/avee/Design/SortDesign$7;
.super Ljava/lang/Object;
.source "SortDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR3$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/SortDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR3$Handler<",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
        "Ljava/io/File;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/SortDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/SortDesign;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lcom/daaw/avee/Design/SortDesign$7;->this$0:Lcom/daaw/avee/Design/SortDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;Ljava/io/File;)Ljava/lang/Boolean;
    .locals 0

    .line 144
    invoke-virtual {p3}, Ljava/io/File;->isDirectory()Z

    move-result p1

    const/4 p2, 0x1

    .line 145
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    if-eqz p1, :cond_0

    return-object p2

    .line 147
    :cond_0
    invoke-static {p3}, Lcom/daaw/avee/Common/UtilsFileSys;->extractFilenameExt(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "mp3"

    .line 149
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    return-object p2

    :cond_1
    const-string p3, "wav"

    .line 150
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    return-object p2

    :cond_2
    const-string p3, "mp4"

    .line 152
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    return-object p2

    :cond_3
    const-string p3, "m4a"

    .line 153
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    return-object p2

    :cond_4
    const-string p3, "m4p"

    .line 154
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    return-object p2

    :cond_5
    const-string p3, "m4b"

    .line 155
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    return-object p2

    :cond_6
    const-string p3, "m4r"

    .line 156
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_7

    return-object p2

    :cond_7
    const-string p3, "m4v"

    .line 157
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_8

    return-object p2

    :cond_8
    const-string p3, "mp4v"

    .line 159
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_9

    return-object p2

    :cond_9
    const-string p3, "3gp"

    .line 161
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_a

    return-object p2

    :cond_a
    const-string p3, "3g2"

    .line 162
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_b

    return-object p2

    :cond_b
    const-string p3, "3gp2"

    .line 164
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_c

    return-object p2

    :cond_c
    const-string p3, "3gpp"

    .line 165
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_d

    return-object p2

    :cond_d
    const-string p3, "3ga"

    .line 167
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_e

    return-object p2

    :cond_e
    const-string p3, "webm"

    .line 169
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_f

    return-object p2

    :cond_f
    const-string p3, "flv"

    .line 171
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_10

    return-object p2

    :cond_10
    const-string p3, "aac"

    .line 173
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_11

    return-object p2

    :cond_11
    const-string p3, "mkv"

    .line 175
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_12

    return-object p2

    :cond_12
    const-string p3, "fmp4"

    .line 176
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_13

    return-object p2

    :cond_13
    const-string p3, "ts"

    .line 178
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_14

    return-object p2

    :cond_14
    const-string p3, "tsv"

    .line 179
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_15

    return-object p2

    :cond_15
    const-string p3, "tsa"

    .line 180
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_16

    return-object p2

    :cond_16
    const-string p3, "flac"

    .line 182
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_17

    return-object p2

    :cond_17
    const-string p3, "mid"

    .line 184
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_18

    return-object p2

    :cond_18
    const-string p3, "midi"

    .line 185
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_19

    return-object p2

    :cond_19
    const-string p3, "rmi"

    .line 186
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1a

    return-object p2

    :cond_1a
    const-string p3, "xmf"

    .line 188
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1b

    return-object p2

    :cond_1b
    const-string p3, "mxmf"

    .line 189
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1c

    return-object p2

    :cond_1c
    const-string p3, "rtttl"

    .line 190
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1d

    return-object p2

    :cond_1d
    const-string p3, "rtx"

    .line 191
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1e

    return-object p2

    :cond_1e
    const-string p3, "ota"

    .line 192
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1f

    return-object p2

    :cond_1f
    const-string p3, "imy"

    .line 193
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_20

    return-object p2

    :cond_20
    const-string p3, "ogg"

    .line 195
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_21

    return-object p2

    :cond_21
    const-string p3, "asf"

    .line 197
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_22

    return-object p2

    :cond_22
    const-string p3, "wma"

    .line 198
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_23

    return-object p2

    :cond_23
    const-string p3, "wmv"

    .line 199
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_24

    return-object p2

    :cond_24
    const-string p3, "wm"

    .line 200
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_25

    return-object p2

    :cond_25
    const-string p3, "asx"

    .line 202
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_26

    return-object p2

    :cond_26
    const-string p3, "wax"

    .line 203
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_27

    return-object p2

    :cond_27
    const-string p3, "wvx"

    .line 204
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_28

    return-object p2

    :cond_28
    const-string p3, "wmx"

    .line 205
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_29

    return-object p2

    :cond_29
    const-string p3, "wpl"

    .line 207
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2a

    return-object p2

    :cond_2a
    const-string p3, "dvr-ms"

    .line 208
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2b

    return-object p2

    :cond_2b
    const-string p3, "wmd"

    .line 209
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2c

    return-object p2

    :cond_2c
    const-string p3, "avi"

    .line 210
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2d

    return-object p2

    :cond_2d
    const-string p3, "mpg"

    .line 212
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2e

    return-object p2

    :cond_2e
    const-string p3, "mpeg"

    .line 213
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2f

    return-object p2

    :cond_2f
    const-string p3, "m1v"

    .line 214
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_30

    return-object p2

    :cond_30
    const-string p3, "mp2"

    .line 215
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_31

    return-object p2

    :cond_31
    const-string p3, "mpa"

    .line 216
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_32

    return-object p2

    :cond_32
    const-string p3, "mpe"

    .line 217
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_33

    return-object p2

    :cond_33
    const-string p3, "mpga"

    .line 219
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_34

    return-object p2

    :cond_34
    const-string p3, "aif"

    .line 221
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_35

    return-object p2

    :cond_35
    const-string p3, "aifc"

    .line 222
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_36

    return-object p2

    :cond_36
    const-string p3, "aiff"

    .line 223
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_37

    return-object p2

    :cond_37
    const-string p3, "au"

    .line 225
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_38

    return-object p2

    :cond_38
    const-string p3, "snd"

    .line 226
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_39

    return-object p2

    :cond_39
    const-string p3, "cda"

    .line 227
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3a

    return-object p2

    :cond_3a
    const-string p3, "ivf"

    .line 228
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3b

    return-object p2

    :cond_3b
    const-string p3, "mov"

    .line 230
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3c

    return-object p2

    :cond_3c
    const-string p3, "adt"

    .line 232
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3d

    return-object p2

    :cond_3d
    const-string p3, "adts"

    .line 233
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3e

    return-object p2

    :cond_3e
    const-string p3, "m2ts"

    .line 235
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3f

    return-object p2

    :cond_3f
    const-string p3, "amr"

    .line 237
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_40

    return-object p2

    :cond_40
    const-string p3, "aup"

    .line 238
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_41

    return-object p2

    :cond_41
    const-string p3, "caf"

    .line 239
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_42

    return-object p2

    :cond_42
    const-string p3, "kar"

    .line 240
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_43

    return-object p2

    :cond_43
    const-string p3, "mmf"

    .line 242
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_44

    return-object p2

    :cond_44
    const-string p3, "oma"

    .line 243
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_45

    return-object p2

    :cond_45
    const-string p3, "opus"

    .line 244
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_46

    return-object p2

    :cond_46
    const-string p3, "qcp"

    .line 245
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_47

    return-object p2

    :cond_47
    const-string p3, "ra"

    .line 247
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_48

    return-object p2

    :cond_48
    const-string p3, "ram"

    .line 248
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_49

    return-object p2

    :cond_49
    const-string p3, "xspf"

    .line 250
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4a

    return-object p2

    :cond_4a
    const-string p3, "m3u"

    .line 252
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4b

    return-object p2

    :cond_4b
    const-string p3, "m3u8"

    .line 253
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4c

    return-object p2

    :cond_4c
    const/4 p1, 0x0

    .line 255
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 140
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    check-cast p3, Ljava/io/File;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/SortDesign$7;->invoke(Ljava/lang/Integer;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;Ljava/io/File;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
