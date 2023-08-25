.class public Lcom/daaw/zt1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/zt1;->d(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/sd0;

.field public final synthetic b:Lcom/daaw/zt1;


# direct methods
.method public constructor <init>(Lcom/daaw/zt1;Lcom/daaw/sd0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zt1$a;->b:Lcom/daaw/zt1;

    iput-object p2, p0, Lcom/daaw/zt1$a;->a:Lcom/daaw/sd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/zt1$a;->b:Lcom/daaw/zt1;

    iget-object p2, p0, Lcom/daaw/zt1$a;->a:Lcom/daaw/sd0;

    const/4 v0, -0x1

    invoke-static {p1, v0, p2}, Lcom/daaw/zt1;->a(Lcom/daaw/zt1;ILcom/daaw/sd0;)V

    return-void
.end method
