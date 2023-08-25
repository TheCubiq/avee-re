.class public Lcom/daaw/qv1$v;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/qv1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "v"
.end annotation


# instance fields
.field public a:Z

.field public final synthetic b:Lcom/daaw/qv1;


# direct methods
.method public constructor <init>(Lcom/daaw/qv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1$v;->b:Lcom/daaw/qv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/qv1$v;->a:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/qv1;Lcom/daaw/qv1$k;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/qv1$v;-><init>(Lcom/daaw/qv1;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/qv1$v;->a:Z

    return-void
.end method
