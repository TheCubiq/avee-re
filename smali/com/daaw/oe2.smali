.class public final Lcom/daaw/oe2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/nio/ByteBuffer;

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:Ljava/nio/ByteBuffer;


# direct methods
.method public synthetic constructor <init>(Ljava/nio/ByteBuffer;JJJLjava/nio/ByteBuffer;Lcom/daaw/ne2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/oe2;->a:Ljava/nio/ByteBuffer;

    iput-wide p2, p0, Lcom/daaw/oe2;->b:J

    iput-wide p4, p0, Lcom/daaw/oe2;->c:J

    iput-wide p6, p0, Lcom/daaw/oe2;->d:J

    iput-object p8, p0, Lcom/daaw/oe2;->e:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/oe2;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/oe2;->b:J

    return-wide v0
.end method

.method public static bridge synthetic b(Lcom/daaw/oe2;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/oe2;->c:J

    return-wide v0
.end method

.method public static bridge synthetic c(Lcom/daaw/oe2;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/oe2;->d:J

    return-wide v0
.end method

.method public static bridge synthetic d(Lcom/daaw/oe2;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, Lcom/daaw/oe2;->e:Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/oe2;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, Lcom/daaw/oe2;->a:Ljava/nio/ByteBuffer;

    return-object p0
.end method
