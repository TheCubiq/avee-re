.class public final Lcom/daaw/kf;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lcom/google/android/exoplayer2/trackselection/c;ILjava/lang/Exception;)Z
    .locals 2

    const-wide/32 v0, 0xea60

    invoke-static {p0, p1, p2, v0, v1}, Lcom/daaw/kf;->b(Lcom/google/android/exoplayer2/trackselection/c;ILjava/lang/Exception;J)Z

    move-result p0

    return p0
.end method

.method public static b(Lcom/google/android/exoplayer2/trackselection/c;ILjava/lang/Exception;J)Z
    .locals 4

    invoke-static {p2}, Lcom/daaw/kf;->c(Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0, p1, p3, p4}, Lcom/google/android/exoplayer2/trackselection/c;->c(IJ)Z

    move-result v0

    check-cast p2, Lcom/daaw/tb0$e;

    iget p2, p2, Lcom/daaw/tb0$e;->r:I

    const-string v1, ", format="

    if-eqz v0, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Blacklisted: duration="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, ", responseCode="

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0, p1}, Lcom/google/android/exoplayer2/trackselection/c;->d(I)Lcom/google/android/exoplayer2/Format;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Blacklisting failed (cannot blacklist last enabled track): responseCode="

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0, p1}, Lcom/google/android/exoplayer2/trackselection/c;->d(I)Lcom/google/android/exoplayer2/Format;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_0
    return v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static c(Ljava/lang/Exception;)Z
    .locals 2

    instance-of v0, p0, Lcom/daaw/tb0$e;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p0, Lcom/daaw/tb0$e;

    iget p0, p0, Lcom/daaw/tb0$e;->r:I

    const/16 v0, 0x194

    if-eq p0, v0, :cond_0

    const/16 v0, 0x19a

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    return v1
.end method
