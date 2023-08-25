.class public final Lcom/daaw/y58;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/List;

.field public final b:I

.field public final c:J

.field public final d:Lcom/daaw/wt8;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/daaw/wt8;IJLcom/daaw/v58;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/y58;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/daaw/y58;->d:Lcom/daaw/wt8;

    iput p3, p0, Lcom/daaw/y58;->b:I

    iput-wide p4, p0, Lcom/daaw/y58;->c:J

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/y58;)I
    .locals 0

    iget p0, p0, Lcom/daaw/y58;->b:I

    return p0
.end method

.method public static bridge synthetic b(Lcom/daaw/y58;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/y58;->c:J

    return-wide v0
.end method

.method public static bridge synthetic c(Lcom/daaw/y58;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/y58;->a:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/y58;)Lcom/daaw/wt8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/y58;->d:Lcom/daaw/wt8;

    return-object p0
.end method
