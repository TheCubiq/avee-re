.class public Lcom/daaw/yn0;
.super Lcom/daaw/n;
.source ""


# instance fields
.field public c:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/n;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/yn0;->c:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/daaw/yn0;->c:Ljava/lang/Long;

    return-object v0
.end method

.method public c()Lcom/daaw/rk;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
