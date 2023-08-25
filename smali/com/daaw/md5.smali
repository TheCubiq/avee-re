.class public final Lcom/daaw/md5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/daaw/ym6;

.field public final c:Lcom/daaw/ym6;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/daaw/ym6;Lcom/daaw/ym6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/md5;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/md5;->b:Lcom/daaw/ym6;

    iput-object p3, p0, Lcom/daaw/md5;->c:Lcom/daaw/ym6;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/md5;)Lcom/daaw/ym6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/md5;->c:Lcom/daaw/ym6;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/daaw/md5;)Lcom/daaw/ym6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/md5;->b:Lcom/daaw/ym6;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/daaw/md5;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/daaw/md5;->a:Ljava/lang/String;

    return-object p0
.end method
