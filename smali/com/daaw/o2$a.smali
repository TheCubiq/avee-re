.class public Lcom/daaw/o2$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/o2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/bx0;Lcom/daaw/zf;)Lcom/daaw/o2;
    .locals 1

    new-instance v0, Lcom/daaw/o2;

    invoke-direct {v0, p1, p2}, Lcom/daaw/o2;-><init>(Lcom/daaw/bx0;Lcom/daaw/zf;)V

    return-object v0
.end method
