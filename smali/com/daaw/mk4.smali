.class public final Lcom/daaw/mk4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/se3;

.field public final b:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/daaw/se3;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mk4;->a:Lcom/daaw/se3;

    iput-object p2, p0, Lcom/daaw/mk4;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/se3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/mk4;->a:Lcom/daaw/se3;

    return-object v0
.end method

.method public final b()Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lcom/daaw/mk4;->b:Ljava/lang/Runnable;

    return-object v0
.end method
