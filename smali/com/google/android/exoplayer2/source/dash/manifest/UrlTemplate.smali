.class public final Lcom/google/android/exoplayer2/source/dash/manifest/UrlTemplate;
.super Ljava/lang/Object;
.source "UrlTemplate.java"


# static fields
.field private static final BANDWIDTH:Ljava/lang/String; = "Bandwidth"

.field private static final BANDWIDTH_ID:I = 0x3

.field private static final DEFAULT_FORMAT_TAG:Ljava/lang/String; = "%01d"

.field private static final ESCAPED_DOLLAR:Ljava/lang/String; = "$$"

.field private static final NUMBER:Ljava/lang/String; = "Number"

.field private static final NUMBER_ID:I = 0x2

.field private static final REPRESENTATION:Ljava/lang/String; = "RepresentationID"

.field private static final REPRESENTATION_ID:I = 0x1

.field private static final TIME:Ljava/lang/String; = "Time"

.field private static final TIME_ID:I = 0x4


# instance fields
.field private final identifierCount:I

.field private final identifierFormatTags:[Ljava/lang/String;

.field private final identifiers:[I

.field private final urlPieces:[Ljava/lang/String;


# direct methods
.method private constructor <init>([Ljava/lang/String;[I[Ljava/lang/String;I)V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/manifest/UrlTemplate;->urlPieces:[Ljava/lang/String;

    .line 67
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/dash/manifest/UrlTemplate;->identifiers:[I

    .line 68
    iput-object p3, p0, Lcom/google/android/exoplayer2/source/dash/manifest/UrlTemplate;->identifierFormatTags:[Ljava/lang/String;

    .line 69
    iput p4, p0, Lcom/google/android/exoplayer2/source/dash/manifest/UrlTemplate;->identifierCount:I

    return-void
.end method

.method public static compile(Ljava/lang/String;)Lcom/google/android/exoplayer2/source/dash/manifest/UrlTemplate;
    .locals 4

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x4

    new-array v2, v1, [I

    new-array v1, v1, [Ljava/lang/String;

    .line 57
    invoke-static {p0, v0, v2, v1}, Lcom/google/android/exoplayer2/source/dash/manifest/UrlTemplate;->parseTemplate(Ljava/lang/String;[Ljava/lang/String;[I[Ljava/lang/String;)I

    move-result p0

    .line 58
    new-instance v3, Lcom/google/android/exoplayer2/source/dash/manifest/UrlTemplate;

    invoke-direct {v3, v0, v2, v1, p0}, Lcom/google/android/exoplayer2/source/dash/manifest/UrlTemplate;-><init>([Ljava/lang/String;[I[Ljava/lang/String;I)V

    return-object v3
.end method

.method private static parseTemplate(Ljava/lang/String;[Ljava/lang/String;[I[Ljava/lang/String;)I
    .locals 11

    const-string v0, ""

    const/4 v1, 0x0

    .line 118
    aput-object v0, p1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 121
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v2, v4, :cond_d

    const-string v4, "$"

    .line 122
    invoke-virtual {p0, v4, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_0

    .line 124
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v5, p1, v3

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, p1, v3

    .line 125
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    goto :goto_0

    :cond_0
    if-eq v5, v2, :cond_1

    .line 127
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v6, p1, v3

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, p1, v3

    move v2, v5

    goto :goto_0

    :cond_1
    const-string v5, "$$"

    .line 129
    invoke-virtual {p0, v5, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 130
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v6, p1, v3

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, p1, v3

    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 133
    invoke-virtual {p0, v4, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v4

    .line 134
    invoke-virtual {p0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v5, "RepresentationID"

    .line 135
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/4 v7, 0x1

    if-eqz v5, :cond_3

    .line 136
    aput v7, p2, v3

    goto/16 :goto_4

    :cond_3
    const-string v5, "%0"

    .line 138
    invoke-virtual {v2, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    if-eq v5, v6, :cond_5

    .line 141
    invoke-virtual {v2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, "d"

    .line 142
    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_4

    .line 143
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 145
    :cond_4
    invoke-virtual {v2, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_5
    const-string v8, "%01d"

    .line 147
    :goto_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v5

    const v9, -0x74423897

    const/4 v10, 0x2

    if-eq v5, v9, :cond_8

    const v9, 0x27c6ed

    if-eq v5, v9, :cond_7

    const v9, 0x246e091

    if-eq v5, v9, :cond_6

    goto :goto_2

    :cond_6
    const-string v5, "Bandwidth"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const/4 v6, 0x1

    goto :goto_2

    :cond_7
    const-string v5, "Time"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const/4 v6, 0x2

    goto :goto_2

    :cond_8
    const-string v5, "Number"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const/4 v6, 0x0

    :cond_9
    :goto_2
    if-eqz v6, :cond_c

    if-eq v6, v7, :cond_b

    if-ne v6, v10, :cond_a

    const/4 v2, 0x4

    .line 155
    aput v2, p2, v3

    goto :goto_3

    .line 158
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Invalid template: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    const/4 v2, 0x3

    .line 152
    aput v2, p2, v3

    goto :goto_3

    .line 149
    :cond_c
    aput v10, p2, v3

    .line 160
    :goto_3
    aput-object v8, p3, v3

    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 163
    aput-object v0, p1, v3

    add-int/lit8 v4, v4, 0x1

    move v2, v4

    goto/16 :goto_0

    :cond_d
    return v3
.end method


# virtual methods
.method public buildUri(Ljava/lang/String;JIJ)Ljava/lang/String;
    .locals 7

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 85
    :goto_0
    iget v3, p0, Lcom/google/android/exoplayer2/source/dash/manifest/UrlTemplate;->identifierCount:I

    if-ge v2, v3, :cond_4

    .line 86
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/dash/manifest/UrlTemplate;->urlPieces:[Ljava/lang/String;

    aget-object v3, v3, v2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/dash/manifest/UrlTemplate;->identifiers:[I

    aget v4, v3, v2

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    .line 88
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 89
    :cond_0
    aget v4, v3, v2

    const/4 v6, 0x2

    if-ne v4, v6, :cond_1

    .line 90
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    iget-object v4, p0, Lcom/google/android/exoplayer2/source/dash/manifest/UrlTemplate;->identifierFormatTags:[Ljava/lang/String;

    aget-object v4, v4, v2

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 91
    :cond_1
    aget v4, v3, v2

    const/4 v6, 0x3

    if-ne v4, v6, :cond_2

    .line 92
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    iget-object v4, p0, Lcom/google/android/exoplayer2/source/dash/manifest/UrlTemplate;->identifierFormatTags:[Ljava/lang/String;

    aget-object v4, v4, v2

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 93
    :cond_2
    aget v3, v3, v2

    const/4 v4, 0x4

    if-ne v3, v4, :cond_3

    .line 94
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    iget-object v4, p0, Lcom/google/android/exoplayer2/source/dash/manifest/UrlTemplate;->identifierFormatTags:[Ljava/lang/String;

    aget-object v4, v4, v2

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 97
    :cond_4
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/manifest/UrlTemplate;->urlPieces:[Ljava/lang/String;

    aget-object p1, p1, v3

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
