.class public final Lcom/daaw/l81$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/l81;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/pq;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/l81$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/m81;)Lcom/daaw/l81;
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/daaw/l81;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/daaw/l81;-><init>(Lcom/daaw/m81;Lcom/daaw/pq;)V

    return-object v0
.end method
