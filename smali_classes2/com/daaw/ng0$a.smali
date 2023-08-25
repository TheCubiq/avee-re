.class public final Lcom/daaw/ng0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ng0;
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

    invoke-direct {p0}, Lcom/daaw/ng0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(III)Lcom/daaw/ng0;
    .locals 1

    new-instance v0, Lcom/daaw/ng0;

    invoke-direct {v0, p1, p2, p3}, Lcom/daaw/ng0;-><init>(III)V

    return-object v0
.end method
