.class public final Lcom/daaw/mr2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/fq2;

.field public final b:J

.field public final c:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/fq2;JJLcom/daaw/lr2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mr2;->a:Lcom/daaw/fq2;

    iput-wide p2, p0, Lcom/daaw/mr2;->b:J

    iput-wide p4, p0, Lcom/daaw/mr2;->c:J

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/mr2;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/mr2;->b:J

    return-wide v0
.end method

.method public static bridge synthetic b(Lcom/daaw/mr2;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/mr2;->c:J

    return-wide v0
.end method

.method public static bridge synthetic c(Lcom/daaw/mr2;)Lcom/daaw/fq2;
    .locals 0

    iget-object p0, p0, Lcom/daaw/mr2;->a:Lcom/daaw/fq2;

    return-object p0
.end method
