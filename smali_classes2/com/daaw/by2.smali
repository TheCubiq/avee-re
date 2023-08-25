.class public final Lcom/daaw/by2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:J

.field public final synthetic r:Lcom/daaw/vk4;


# direct methods
.method public constructor <init>(Lcom/daaw/vk4;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/by2;->r:Lcom/daaw/vk4;

    iput-object p2, p0, Lcom/daaw/by2;->p:Ljava/lang/String;

    iput-wide p3, p0, Lcom/daaw/by2;->q:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/by2;->r:Lcom/daaw/vk4;

    iget-object v1, p0, Lcom/daaw/by2;->p:Ljava/lang/String;

    iget-wide v2, p0, Lcom/daaw/by2;->q:J

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/vk4;->h(Lcom/daaw/vk4;Ljava/lang/String;J)V

    return-void
.end method
