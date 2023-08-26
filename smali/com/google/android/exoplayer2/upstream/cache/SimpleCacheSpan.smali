.class final Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;
.super Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;
.source "SimpleCacheSpan.java"


# static fields
.field private static final CACHE_FILE_PATTERN_V1:Ljava/util/regex/Pattern;

.field private static final CACHE_FILE_PATTERN_V2:Ljava/util/regex/Pattern;

.field private static final CACHE_FILE_PATTERN_V3:Ljava/util/regex/Pattern;

.field private static final SUFFIX:Ljava/lang/String; = ".v3.exo"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x20

    const-string v1, "^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$"

    .line 32
    invoke-static {v1, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v1

    sput-object v1, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;->CACHE_FILE_PATTERN_V1:Ljava/util/regex/Pattern;

    const-string v1, "^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$"

    .line 34
    invoke-static {v1, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v1

    sput-object v1, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;->CACHE_FILE_PATTERN_V2:Ljava/util/regex/Pattern;

    const-string v1, "^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$"

    .line 36
    invoke-static {v1, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;->CACHE_FILE_PATTERN_V3:Ljava/util/regex/Pattern;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;JJJLjava/io/File;)V
    .locals 0

    .line 162
    invoke-direct/range {p0 .. p8}, Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;-><init>(Ljava/lang/String;JJJLjava/io/File;)V

    return-void
.end method

.method public static createCacheEntry(Ljava/io/File;Lcom/google/android/exoplayer2/upstream/cache/CachedContentIndex;)Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;
    .locals 12

    .line 97
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, ".v3.exo"

    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    .line 99
    invoke-static {p0, p1}, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;->upgradeFile(Ljava/io/File;Lcom/google/android/exoplayer2/upstream/cache/CachedContentIndex;)Ljava/io/File;

    move-result-object p0

    if-nez p0, :cond_0

    return-object v2

    .line 103
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    :cond_1
    move-object v11, p0

    .line 106
    sget-object p0, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;->CACHE_FILE_PATTERN_V3:Ljava/util/regex/Pattern;

    invoke-virtual {p0, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 107
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_2

    return-object v2

    .line 110
    :cond_2
    invoke-virtual {v11}, Ljava/io/File;->length()J

    move-result-wide v7

    const/4 v0, 0x1

    .line 111
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 112
    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/upstream/cache/CachedContentIndex;->getKeyForId(I)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_0

    .line 113
    :cond_3
    new-instance v2, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    const/4 p1, 0x3

    .line 114
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    move-object v3, v2

    invoke-direct/range {v3 .. v11}, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;-><init>(Ljava/lang/String;JJJLjava/io/File;)V

    :goto_0
    return-object v2
.end method

.method public static createClosedHole(Ljava/lang/String;JJ)Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;
    .locals 10

    .line 84
    new-instance v9, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x0

    move-object v0, v9

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-direct/range {v0 .. v8}, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;-><init>(Ljava/lang/String;JJJLjava/io/File;)V

    return-object v9
.end method

.method public static createLookup(Ljava/lang/String;J)Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;
    .locals 10

    .line 61
    new-instance v9, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;

    const-wide/16 v4, -0x1

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x0

    move-object v0, v9

    move-object v1, p0

    move-wide v2, p1

    invoke-direct/range {v0 .. v8}, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;-><init>(Ljava/lang/String;JJJLjava/io/File;)V

    return-object v9
.end method

.method public static createOpenHole(Ljava/lang/String;J)Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;
    .locals 10

    .line 72
    new-instance v9, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;

    const-wide/16 v4, -0x1

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x0

    move-object v0, v9

    move-object v1, p0

    move-wide v2, p1

    invoke-direct/range {v0 .. v8}, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;-><init>(Ljava/lang/String;JJJLjava/io/File;)V

    return-object v9
.end method

.method public static getCacheFile(Ljava/io/File;IJJ)Ljava/io/File;
    .locals 2

    .line 50
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ".v3.exo"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method private static upgradeFile(Ljava/io/File;Lcom/google/android/exoplayer2/upstream/cache/CachedContentIndex;)Ljava/io/File;
    .locals 11

    .line 128
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    .line 129
    sget-object v1, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;->CACHE_FILE_PATTERN_V2:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 130
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    .line 131
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Util;->unescapeFileName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    return-object v4

    .line 136
    :cond_0
    sget-object v1, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;->CACHE_FILE_PATTERN_V1:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 137
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_1

    return-object v4

    .line 140
    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    .line 143
    :cond_2
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v5

    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/upstream/cache/CachedContentIndex;->assignIdForKey(Ljava/lang/String;)I

    move-result v6

    const/4 p1, 0x2

    .line 144
    invoke-virtual {v1, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    const/4 p1, 0x3

    invoke-virtual {v1, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    .line 143
    invoke-static/range {v5 .. v10}, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;->getCacheFile(Ljava/io/File;IJJ)Ljava/io/File;

    move-result-object p1

    .line 145
    invoke-virtual {p0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p0

    if-nez p0, :cond_3

    return-object v4

    :cond_3
    return-object p1
.end method


# virtual methods
.method public copyWithUpdatedLastAccessTime(I)Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;
    .locals 10

    .line 174
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;->isCached:Z

    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkState(Z)V

    .line 175
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 176
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;->file:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    iget-wide v3, p0, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;->position:J

    move v2, p1

    move-wide v5, v7

    invoke-static/range {v1 .. v6}, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;->getCacheFile(Ljava/io/File;IJJ)Ljava/io/File;

    move-result-object v9

    .line 177
    new-instance p1, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;

    iget-object v2, p0, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;->key:Ljava/lang/String;

    iget-wide v3, p0, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;->position:J

    iget-wide v5, p0, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;->length:J

    move-object v1, p1

    invoke-direct/range {v1 .. v9}, Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;-><init>(Ljava/lang/String;JJJLjava/io/File;)V

    return-object p1
.end method
