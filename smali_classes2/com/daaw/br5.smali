.class public final Lcom/daaw/br5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final p:Lcom/daaw/vo5;

.field public final q:I

.field public final r:Ljava/lang/Throwable;

.field public final s:[B

.field public final t:Ljava/lang/String;

.field public final u:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/daaw/vo5;ILjava/lang/Throwable;[BLjava/util/Map;Lcom/daaw/yp5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/br5;->p:Lcom/daaw/vo5;

    iput p3, p0, Lcom/daaw/br5;->q:I

    iput-object p4, p0, Lcom/daaw/br5;->r:Ljava/lang/Throwable;

    iput-object p5, p0, Lcom/daaw/br5;->s:[B

    iput-object p1, p0, Lcom/daaw/br5;->t:Ljava/lang/String;

    iput-object p6, p0, Lcom/daaw/br5;->u:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/br5;->p:Lcom/daaw/vo5;

    iget-object v1, p0, Lcom/daaw/br5;->t:Ljava/lang/String;

    iget v2, p0, Lcom/daaw/br5;->q:I

    iget-object v3, p0, Lcom/daaw/br5;->r:Ljava/lang/Throwable;

    iget-object v4, p0, Lcom/daaw/br5;->s:[B

    iget-object v5, p0, Lcom/daaw/br5;->u:Ljava/util/Map;

    invoke-interface/range {v0 .. v5}, Lcom/daaw/vo5;->a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void
.end method
