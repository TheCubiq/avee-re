.class public Lcom/daaw/s41$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/u41;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/s41;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/s41;


# direct methods
.method public constructor <init>(Lcom/daaw/s41;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/s41$b;->a:Lcom/daaw/s41;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/s41;Lcom/daaw/s41$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/s41$b;-><init>(Lcom/daaw/s41;)V

    return-void
.end method
