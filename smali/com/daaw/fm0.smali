.class public final synthetic Lcom/daaw/fm0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/material/navigation/NavigationView$c;


# instance fields
.field public final synthetic a:Lcom/daaw/avee/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fm0;->a:Lcom/daaw/avee/MainActivity;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/fm0;->a:Lcom/daaw/avee/MainActivity;

    invoke-static {v0, p1}, Lcom/daaw/avee/MainActivity;->T(Lcom/daaw/avee/MainActivity;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
