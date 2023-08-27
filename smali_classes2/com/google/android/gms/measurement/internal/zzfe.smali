.class final Lcom/google/android/gms/measurement/internal/zzfe;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement@@17.5.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zza:Ljava/net/URL;

.field private final zzb:[B

.field private final zzc:Lcom/google/android/gms/measurement/internal/zzfc;

.field private final zzd:Ljava/lang/String;

.field private final zze:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final synthetic zzf:Lcom/google/android/gms/measurement/internal/zzfa;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzfa;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lcom/google/android/gms/measurement/internal/zzfc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/net/URL;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/measurement/internal/zzfc;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzf:Lcom/google/android/gms/measurement/internal/zzfa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 3
    invoke-static {p3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-static {p6}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zza:Ljava/net/URL;

    .line 6
    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzb:[B

    .line 7
    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzc:Lcom/google/android/gms/measurement/internal/zzfc;

    .line 8
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzd:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zze:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    const-string v0, "Error closing HTTP compressed POST connection output stream. appId"

    .line 11
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzf:Lcom/google/android/gms/measurement/internal/zzfa;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgu;->zzb()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 16
    :try_start_0
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzf:Lcom/google/android/gms/measurement/internal/zzfa;

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zza:Ljava/net/URL;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/measurement/internal/zzfa;->zza(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 17
    :try_start_1
    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zze:Ljava/util/Map;

    if-eqz v4, :cond_0

    .line 18
    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zze:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 19
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v6, v5}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 21
    :cond_0
    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzb:[B

    if-eqz v4, :cond_1

    .line 22
    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzf:Lcom/google/android/gms/measurement/internal/zzfa;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzkn;->f_()Lcom/google/android/gms/measurement/internal/zzkt;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzb:[B

    invoke-virtual {v4, v5}, Lcom/google/android/gms/measurement/internal/zzkt;->zzc([B)[B

    move-result-object v4

    .line 23
    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzf:Lcom/google/android/gms/measurement/internal/zzfa;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/zzgu;->zzq()Lcom/google/android/gms/measurement/internal/zzex;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/zzex;->zzw()Lcom/google/android/gms/measurement/internal/zzez;

    move-result-object v5

    const-string v6, "Uploading data. size"

    array-length v7, v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/measurement/internal/zzez;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v5, 0x1

    .line 24
    invoke-virtual {v3, v5}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    const-string v5, "Content-Encoding"

    const-string v6, "gzip"

    .line 25
    invoke-virtual {v3, v5, v6}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    array-length v5, v4

    invoke-virtual {v3, v5}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 27
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->connect()V

    .line 28
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v5
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 29
    :try_start_2
    invoke-virtual {v5, v4}, Ljava/io/OutputStream;->write([B)V

    .line 30
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v4

    move-object v10, v1

    move-object v2, v4

    move-object v1, v5

    goto/16 :goto_4

    :catch_0
    move-exception v4

    move-object v10, v1

    move-object v8, v4

    move-object v1, v5

    goto/16 :goto_8

    .line 32
    :cond_1
    :goto_1
    :try_start_3
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v8
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 33
    :try_start_4
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v11
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 34
    :try_start_5
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzf:Lcom/google/android/gms/measurement/internal/zzfa;

    invoke-static {v2, v3}, Lcom/google/android/gms/measurement/internal/zzfa;->zza(Lcom/google/android/gms/measurement/internal/zzfa;Ljava/net/HttpURLConnection;)[B

    move-result-object v10
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-eqz v3, :cond_2

    .line 36
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 37
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzf:Lcom/google/android/gms/measurement/internal/zzfa;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgu;->zzp()Lcom/google/android/gms/measurement/internal/zzfu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/measurement/internal/zzff;

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzd:Ljava/lang/String;

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzc:Lcom/google/android/gms/measurement/internal/zzfc;

    const/4 v9, 0x0

    const/4 v12, 0x0

    move-object v5, v1

    invoke-direct/range {v5 .. v12}, Lcom/google/android/gms/measurement/internal/zzff;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfc;ILjava/lang/Throwable;[BLjava/util/Map;Lcom/google/android/gms/measurement/internal/zzfd;)V

    .line 38
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/Runnable;)V

    return-void

    :catchall_1
    move-exception v4

    move-object v2, v4

    move v7, v8

    move-object v10, v11

    goto :goto_5

    :catch_1
    move-exception v4

    move v7, v8

    move-object v10, v11

    goto :goto_2

    :catchall_2
    move-exception v4

    move-object v10, v1

    move-object v2, v4

    move v7, v8

    goto :goto_5

    :catch_2
    move-exception v4

    move-object v10, v1

    move v7, v8

    :goto_2
    move-object v8, v4

    goto :goto_9

    :catchall_3
    move-exception v4

    move-object v10, v1

    goto :goto_3

    :catch_3
    move-exception v4

    move-object v10, v1

    goto :goto_7

    :catchall_4
    move-exception v4

    move-object v3, v1

    move-object v10, v3

    :goto_3
    move-object v2, v4

    :goto_4
    const/4 v7, 0x0

    :goto_5
    if-eqz v1, :cond_3

    .line 55
    :try_start_6
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_6

    :catch_4
    move-exception v1

    .line 58
    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzf:Lcom/google/android/gms/measurement/internal/zzfa;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzgu;->zzq()Lcom/google/android/gms/measurement/internal/zzex;

    move-result-object v4

    .line 59
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzex;->zze()Lcom/google/android/gms/measurement/internal/zzez;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzd:Ljava/lang/String;

    .line 60
    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/zzex;->zza(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    .line 61
    invoke-virtual {v4, v0, v5, v1}, Lcom/google/android/gms/measurement/internal/zzez;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    :goto_6
    if-eqz v3, :cond_4

    .line 63
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 64
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzf:Lcom/google/android/gms/measurement/internal/zzfa;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgu;->zzp()Lcom/google/android/gms/measurement/internal/zzfu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/measurement/internal/zzff;

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzd:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzc:Lcom/google/android/gms/measurement/internal/zzfc;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v11}, Lcom/google/android/gms/measurement/internal/zzff;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfc;ILjava/lang/Throwable;[BLjava/util/Map;Lcom/google/android/gms/measurement/internal/zzfd;)V

    .line 65
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/Runnable;)V

    .line 66
    throw v2

    :catch_5
    move-exception v4

    move-object v3, v1

    move-object v10, v3

    :goto_7
    move-object v8, v4

    :goto_8
    const/4 v7, 0x0

    :goto_9
    if-eqz v1, :cond_5

    .line 42
    :try_start_7
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    goto :goto_a

    :catch_6
    move-exception v1

    .line 45
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzf:Lcom/google/android/gms/measurement/internal/zzfa;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzgu;->zzq()Lcom/google/android/gms/measurement/internal/zzex;

    move-result-object v2

    .line 46
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzex;->zze()Lcom/google/android/gms/measurement/internal/zzez;

    move-result-object v2

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzd:Ljava/lang/String;

    .line 47
    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/zzex;->zza(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 48
    invoke-virtual {v2, v0, v4, v1}, Lcom/google/android/gms/measurement/internal/zzez;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    :goto_a
    if-eqz v3, :cond_6

    .line 50
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 51
    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzf:Lcom/google/android/gms/measurement/internal/zzfa;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgu;->zzp()Lcom/google/android/gms/measurement/internal/zzfu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/measurement/internal/zzff;

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzd:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzfe;->zzc:Lcom/google/android/gms/measurement/internal/zzfc;

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v11}, Lcom/google/android/gms/measurement/internal/zzff;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfc;ILjava/lang/Throwable;[BLjava/util/Map;Lcom/google/android/gms/measurement/internal/zzfd;)V

    .line 52
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/lang/Runnable;)V

    return-void
.end method
